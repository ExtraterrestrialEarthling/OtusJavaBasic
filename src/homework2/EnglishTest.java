package homework2;

import java.util.Scanner;

public class EnglishTest {
    static Scanner scanner = new Scanner(System.in);
    static int result;
    static String[] questions = new String[3];
    static String[][] options = new String[3][];
    static int[] keys = new int[3];

    public static void main(String[] args) {
        result = 0;

        // Добавляем в архивы вопросы, варианты ответов и ключи:
        questions[0] = "The doctor ___ in the office.";
        options[0] = new String[3];
        options[0][0] = "am";
        options[0][1] = "is";
        options[0][2] = "are";
        keys[0] = 1;

        questions[1] = "If I ___ you, I would do this.";
        options[1] = new String[4];
        options[1][0] = "were";
        options[1][1] = "am";
        options[1][2] = "is";
        options[1][3] = "are";
        keys[1] = 0;

        questions[2] = "She is late. She ___ missed the bus.";
        options[2] = new String[5];
        options[2][0] = "should have";
        options[2][1] = "can't have";
        options[2][2] = "couldn't";
        options[2][3] = "was able to";
        options[2][4] = "must have";
        keys[2] = 4;


        // Введение:
        System.out.println("Пройдите тест на определение уровня английского языка.");
        System.out.println("Нажмите что-нибудь, чтобы продолжить...");
        scanner.nextLine();


        // Тест:
        System.out.println("Выберете правильный вариант:");
        startTest();

        // Результаты:
        if (result == 0) {
            System.out.println("Ваш уровень: А1. Вы только начинаете свой путь. Успехов в изучении!");
        } else if (result == 1) {
            System.out.println("Ваш уровень: А2. Вы уже кое-что знаете, но вам еще предстоит многое изучить.");
        } else if (result == 2) {
            System.out.println("Ваш уровень: B1. Вы можете уверенно вести беседы на английском на различные темы.");
        } else if (result == 3) {
            System.out.println("Поздравляем! Ваш уровень: C1. Вы свободно говорите на английском, но помните:" +
                    " нет предела совершенству!");
        }


    }

    // Метод, чтобы распознать int или вернуть значение по умолчанию, если int не найден:
    public static int readInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception noNum) {
            return -1;
        }
    }


    // Метод печатает весь тест:
    public static void startTest() {

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int k = 0; k < options[i].length; k++) {
                System.out.printf("%d) " + options[i][k], k + 1);
                System.out.println();
            }
            check(options[i], keys[i]);
        }

    }

    // Метод проверяет, правильный ли ответ:
    public static void check(String[] options, int key) {
        int input;
        do {
            input = readInt(scanner.next());
            if (input < 1 || input > options.length) {
                System.out.printf("Пожалуйста, введите число от 1 до %d!\n", options.length);
                input = -1;
            }
        } while (input == -1);

        if (input == key + 1) {
            result++;
        }

    }


}