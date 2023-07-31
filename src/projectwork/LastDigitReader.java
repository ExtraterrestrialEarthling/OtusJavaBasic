package projectwork;


public class LastDigitReader implements NumberReader {

    public String read(int sum){
        String result;
        if (sum == 0){
            return "ноль";
        }
        // с 11 по 19 - это особые случаи, когда нам не надо считывать последнюю цифру, учтем это:
        int lastButOne = sum%100/10;
        if (lastButOne == 1){
            result = "";
        }
        else{
            result = NumbersEnum.getRepresentation(sum%10);
        }
        return result;
    }



}
