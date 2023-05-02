package homework3;

import static homework3.TestingLogic.*;

public class Start {
    public static void main(String[] args) {

// ��������� ������ �����
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


// �������� ����
        System.out.println("�������� ���� �� ����������� ������ ����������� �����.");
        System.out.println("������� ���-������, ����� ����������...");
        scanner.nextLine();

        for (int i = 0; i < questions.length; i++) {
            questions[i].print();
            Answer answer = getAnswerFromUser(questions[i]);
            answer.check();
            if (answer.isCorrect()) {
                result++;
            }
        }

        // ����������:
        if (result == 0) {
            System.out.println("��� �������: �1. �� ������ ��������� ���� ����. ������� � ��������!");
        } else if (result == 1) {
            System.out.println("��� �������: �2. �� ��� ���-��� ������, �� ��� ��� ��������� ������ �������.");
        } else if (result == 2) {
            System.out.println("��� �������: B1. �� ������ �������� ����� ������ �� ���������� �� ��������� ����.");
        } else if (result == 3) {
            System.out.println("�����������! ��� �������: C1. �� �������� �������� �� ����������, �� �������:" +
                    " ��� ������� ������������!");
        }

    }
}
