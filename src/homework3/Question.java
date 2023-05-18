package homework3;

public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;


    public Question(String questionText) {
        this.questionText = questionText;
    }

    public Question() {

    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void print() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d) " + options[i], i + 1);
            System.out.println();
        }
    }

}
