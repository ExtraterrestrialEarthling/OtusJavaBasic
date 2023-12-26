package projectwork.dummies;

import projectwork.NumberReader;

public class HundredReaderDummy implements NumberReader {
    @Override
    public String read(int number) {
        return "двести";
    }
}
