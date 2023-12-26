package projectwork;

public class ApplicationRunner {
    public void run() {
        NumberReader lastDigitReader = new LastDigitReader();
        NumberReader tensReader = new TensReader();
        NumberReader hundredReader = new HundredReader();
        NumberReader thousandReader = new ThousandReader(lastDigitReader, tensReader, hundredReader);
        CurrencyReader rubleReader = new RubleReader();
        NumberReader moneyReader = new MoneyReader(lastDigitReader, tensReader, hundredReader, thousandReader, rubleReader);

        ConsoleReader consoleReader = new ConsoleReader();
        System.out.println("Введите число от 0 до 999999.");
        while (true) {
            int number = consoleReader.readInt();
            String result = moneyReader.read(number);
            System.out.println(result);
        }
    }
}
