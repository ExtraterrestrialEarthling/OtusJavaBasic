package homework3;

public class Answer {
    private Question question;
    private String userChoice;
    private boolean correct;


    public boolean isCorrect() {
        return correct;
    }

    public Answer(Question question, String userChoice) {
        this.question = question;
        this.userChoice = userChoice;
    }

    public void check() {
        if (question.getCorrectAnswer().equalsIgnoreCase(userChoice)) {
            correct = true;
        }
    }


}
