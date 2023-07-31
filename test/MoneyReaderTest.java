import projectwork.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import projectwork.dummies.HundredReaderDummy;
import projectwork.dummies.LastDigitReaderDummy;
import projectwork.dummies.TensReaderDummy;

public class MoneyReaderTest {

    @Test
    public void lastDigitShouldBeCorrect(){
        NumberReader lastDigitReader = new LastDigitReader();
        Assertions.assertEquals("два", lastDigitReader.read(122));
        Assertions.assertEquals("восемь", lastDigitReader.read(124428));
        Assertions.assertEquals("", lastDigitReader.read(1200));
        Assertions.assertEquals("ноль", lastDigitReader.read(0));
    }

    @Test
    public void tensReaderShouldReadCorrectly(){
        NumberReader tensReader = new TensReader();
        Assertions.assertEquals("десять", tensReader.read(12310));
        Assertions.assertEquals("двенадцать", tensReader.read(12));
        Assertions.assertEquals("", tensReader.read(1201));
    }

    @Test
    public void hundredReaderShouldReadCorrectly(){
        NumberReader hundredReader = new HundredReader();
        Assertions.assertEquals("сто", hundredReader.read(100100));
        Assertions.assertEquals("пятьсот", hundredReader.read(23500));
        Assertions.assertEquals("", hundredReader.read(12));
        Assertions.assertEquals("", hundredReader.read(20012));
    }

    @Test
    public void thousandReaderShouldReadCorrectly(){
        NumberReader lastDigitReader = new LastDigitReaderDummy();
        NumberReader tensReader = new TensReaderDummy();
        NumberReader hundredReader = new HundredReaderDummy();
        NumberReader thousandReader2 = new ThousandReader(lastDigitReader, tensReader, hundredReader);
        Assertions.assertEquals("двести двадцать две тысячи", thousandReader2.read(222000));
        Assertions.assertEquals("двести двадцать две тысячи", thousandReader2.read(222124));

        NumberReader lastDigitReader7 = new LastDigitReaderDummy(){
            public String read(int number){
                return "семь";
            }
        };
        NumberReader thousandReader7 = new ThousandReader(lastDigitReader7, tensReader, hundredReader);
        Assertions.assertEquals("двести двадцать семь тысяч", thousandReader7.read(227000));

        NumberReader lastDigitReader1 = new LastDigitReaderDummy(){
            public String read(int number){
                return "одна";
            }
        };
        NumberReader thousandReader1 = new ThousandReader(lastDigitReader1, tensReader, hundredReader);
        Assertions.assertEquals("двести двадцать одна тысяча", thousandReader1.read(221000));

    }

    @Test
    public void currencyShouldBeCorrect(){
        CurrencyReader currencyReader = new RubleReader();
        Assertions.assertEquals("рубля", currencyReader.getProperCurrencyName(123));
        Assertions.assertEquals("рублей", currencyReader.getProperCurrencyName(125));
        Assertions.assertEquals("рубль", currencyReader.getProperCurrencyName(1));

    }

    }

