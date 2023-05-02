package homework3;

import java.util.Scanner;

public class TestingLogic {
    public static int result;
    static Scanner scanner = new Scanner(System.in);


    public static int readInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception noNum) {
            return -1;
        }
    }


    public static Answer getAnswerFromUser(Question question) {
        int input;
        do {
            input = readInt(scanner.next());
            if (input < 1 || input > question.getOptions().length) {
                System.out.printf("Пожалуйста, введите число от 1 до %d!\n", question.getOptions().length);
                input = -1;
            }
        } while (input == -1);

        return new Answer(question, question.getOptions()[input - 1]);

    }

}
