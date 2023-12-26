package projectwork.dummies;

import projectwork.NumberReader;

public class LastDigitReaderDummy implements NumberReader {
    @Override
    public String read(int number) {
        return "два";
    }
}
