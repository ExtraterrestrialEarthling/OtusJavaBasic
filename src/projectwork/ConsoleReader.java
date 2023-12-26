package projectwork;

import java.util.Scanner;

public class ConsoleReader {
    public int readInt() {
        int result;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                if (result < 0 || result > 999999) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Число должно быть от 0 до 999999!");
            }
        }
        return result;
    }
}
