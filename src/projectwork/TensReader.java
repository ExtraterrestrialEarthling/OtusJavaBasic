package projectwork;

public class TensReader implements NumberReader {
    public String read(int sum){
        String result;
        int twoLastDigits = sum%100;
        int lastButOne = sum%100/10;
        if (lastButOne == 1){

            result = NumbersEnum.getRepresentation(twoLastDigits);
        }
        else{
            result = NumbersEnum.getRepresentation(lastButOne*10);
        }
        return result;
    }
}
