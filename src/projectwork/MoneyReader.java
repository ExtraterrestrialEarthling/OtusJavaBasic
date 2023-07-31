package projectwork;

import java.util.ArrayList;
import java.util.List;

public class MoneyReader implements NumberReader{
    NumberReader lastDigitReader;
    NumberReader tensReader;
    NumberReader hundredReader;
    NumberReader thousandReader;
    CurrencyReader currencyReader;

    public MoneyReader(NumberReader lastDigitReader, NumberReader tensReader,
                       NumberReader hundredReader, NumberReader thousandReader,
                       CurrencyReader currencyReader) {
        this.lastDigitReader = lastDigitReader;
        this.tensReader = tensReader;
        this.hundredReader = hundredReader;
        this.thousandReader = thousandReader;
        this.currencyReader = currencyReader;
    }

    public String read(int number){
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        list.add(thousandReader.read(number));
        list.add(hundredReader.read(number));
        list.add(tensReader.read(number));
        list.add(lastDigitReader.read(number));
        list.add(currencyReader.getProperCurrencyName(number));

            for (String element : list){
                sb.append(element).append(" ");
            }
            return sb.toString().trim().replaceAll("\\s+", " ");
    }
}
