package homework3;

public class Start {
    public Start() {
    }

    public static void main(String[] args) {

        // Заполняем информацию теста
        Question question1 = new Question("The doctor ___ in the office.");
        question1.setOptions(new String[]{"am", "is", "are"});
        question1.setCorrectAnswer("is");
        Question question2 = new Question("If I ___ you, I would do this.");
        question2.setOptions(new String[]{"were", "am", "is", "are"});
        question2.setCorrectAnswer("were");
        Question question3 = new Question("She is late. She ___ missed the bus.");
        question3.setOptions(new String[]{"should have", "can't have", "couldn't", "was able to", "must have"});
        question3.setCorrectAnswer("must have");
        Question[] questions = new Question[]{question1, question2, question3};

        // Начинаем тест

        System.out.println("Пройдите тест на определение уровня английского языка.");
        System.out.println("Нажмите что-нибудь, чтобы продолжить...");
        TestingLogic.scanner.nextLine();

        for (int i = 0; i < questions.length; ++i) {
            questions[i].print();
            Answer answer = TestingLogic.getAnswerFromUser(questions[i]);
            answer.check();
            if (answer.isCorrect()) {
                ++TestingLogic.result;
            }
        }

        // Выводим результат
        if (TestingLogic.result == 0) {
            System.out.println("Ваш уровень: А1. Вы только начинаете свой путь. Успехов в изучении!");
        } else if (TestingLogic.result == 1) {
            System.out.println("Ваш уровень: А2. Вы уже кое-что знаете, но вам еще предстоит многое изучить.");
        } else if (TestingLogic.result == 2) {
            System.out.println("Ваш уровень: B1. Вы можете уверенно вести беседы на английском на различные темы.");
        } else if (TestingLogic.result == 3) {
            System.out.println("Поздравляем! Ваш уровень: C1. Вы свободно говорите на английском, но помните: нет предела совершенству!");
        }

    }
}
