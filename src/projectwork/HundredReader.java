package projectwork;

public class HundredReader implements NumberReader {

    public String read(int sum){
        String result;
        int hundred = sum%1000/100*100;
            result = NumbersEnum.getRepresentation(hundred);
        return result;
    }
}
