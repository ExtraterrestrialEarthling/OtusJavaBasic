package homework2;

import java.util.Scanner;

public class EnglishTest {
    static Scanner scanner = new Scanner(System.in);
    static int result;
    static String[] questions = new String[3];

    public static void main(String[] args) {
        result = 0;

        // Добавляем в архив вопросы
        questions[0] = "The doctor ___ in the office.\n"+
                "1) am\n2) is\n3) are";
        questions[1] = "If I ___ you, I would do this.\n"+
                "1) were\n2) am\n3) is\n4) are";
        questions[2] = "She is late. She ___ missed the bus.\n"+
                "1) should have\n2) can't have\n3) couldn't\n4) was able to\n5) must have";


        // Введение
        System.out.println("Пройдите тест на определение уровня английского языка.");
        System.out.println("Нажмите что-нибудь, чтобы продолжить...");
        scanner.nextLine();


        // Тест
        System.out.println("Выберете правильный вариант:");
        askAndCheck(questions[0], 3, 2);
        askAndCheck(questions[1], 4, 1);
        askAndCheck(questions[2], 5, 5);

        // Результаты
        if (result == 0) {
            System.out.println("Ваш уровень: А1. Вы только начинаете свой путь. Успехов в изучении!");
        } else if (result == 1){
            System.out.println("Ваш уровень: А2. Вы уже кое-что знаете, но вам еще предстоит многое изучить.");
        } else if (result ==2){
            System.out.println("Ваш уровень: B1. Вы можете уверенно вести беседы на английском на различные темы.");
        } else if(result ==3){
            System.out.println("Поздравляем! Ваш уровень: C1. Вы свободно говорите на английском, но помните:"+
                    " нет предела совершенству!");
        }

    }

    // метод, чтобы считать int или вернуть значение по умолчанию, если int не найден
    public static int readInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception noNum) {
            return -1;
        }
    }


    // Задаем вопрос и проверяем, верный ли ответ
    public static void askAndCheck(String question, int numberOfOptions, int correctAnswer){
        System.out.println(question);
        int input;
        do {
            input = readInt(scanner.next());
            if(input<1||input>numberOfOptions){
                System.out.printf("Пожалуйста, введите число от 1 до %d!\n", numberOfOptions);
                input = -1;
            }
        } while (input==-1);

        if (input==correctAnswer){
            result++;
        }

    }


}