package projectwork;

import java.util.ArrayList;
import java.util.List;

public class ThousandReader implements NumberReader {
    private NumberReader lastDigitReader;
    private NumberReader tensReader;
    private NumberReader hundredReader;

    public ThousandReader(NumberReader lastDigitReader, NumberReader tensReader, NumberReader hundredReader) {
        this.lastDigitReader = lastDigitReader;
        this.tensReader = tensReader;
        this.hundredReader = hundredReader;
    }

    public String read(int sum){
        StringBuilder sb = new StringBuilder();
        int thousandPart = sum/1000;
        sb.append(hundredReader.read(thousandPart)).append(" ");
        sb.append(tensReader.read(thousandPart)).append(" ");
        sb.append(this.getProperLastDigit(thousandPart)).append(" ");
        sb.append(getProperThousandName(thousandPart)).append(" ");
        return sb.toString().trim().replaceAll("\\s+", " ");
    }

    private static String getProperThousandName(int sum){
        int lastDigit = sum%10;
        if(sum == 0){
            return "";
        }
        if (lastDigit > 4||lastDigit==0||(sum%100>10)&&(sum%100<20)){
            return "тысяч";
        }
        if (lastDigit == 1&&sum%100!=11){
            return "тысяча";
        }
        if (lastDigit > 1 && lastDigit < 5){
            return "тысячи";
        }

        return "";
    }

    private String getProperLastDigit(int thousandPart) {
        int lastButOne = thousandPart % 100 / 10;
        if (lastButOne == 1||thousandPart==0) {
            return "";
        } else {
            if (thousandPart % 10 == 1) {
                return "одна";
            }
            if (thousandPart % 10 == 2) {
                return "две";
            }
            return lastDigitReader.read(thousandPart);
        }
    }
    }

