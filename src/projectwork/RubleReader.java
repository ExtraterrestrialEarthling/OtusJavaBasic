package projectwork;

public class RubleReader implements CurrencyReader {
    public String getProperCurrencyName(int sum){
        int lastDigit = sum%10;
        if (lastDigit > 4||lastDigit==0||(sum%100>10)&&(sum%100<20)){
            return "рублей";
        }
        if (lastDigit == 1&&sum%100!=11){
            return "рубль";
        }
        if (lastDigit > 1 && lastDigit < 5){
            return "рубля";
        }

        return "";
    }
}
