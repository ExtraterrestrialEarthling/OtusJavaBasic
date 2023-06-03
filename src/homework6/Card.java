package homework6;

import java.util.Objects;
import java.util.Scanner;

public class Card {
    private String front;
    private String back;

    public Card(String front, String back){
        this.front = front;
        this.back = back;
    }
    public Card(){

    }


    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public static Card createCard(){
        Card card = new Card();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        card.setFront(scanner.nextLine());
        System.out.println("Введите перевод:");
        card.setBack(scanner.nextLine());
        return card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(front, card.front) && Objects.equals(back, card.back);
    }

    @Override
    public int hashCode() {
        return Objects.hash(front, back);
    }
}
