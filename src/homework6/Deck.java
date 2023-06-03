package homework6;

import java.util.*;

import static homework6.Card.createCard;
import static homework6.User.readInt;

public class Deck {
    private String name;
    private List<Card> listOfCards;

    public Deck(String name){
        this.name = name;
        this.listOfCards = new ArrayList<>();
    }



    public List<Card> getListOfCards() {
        return this.listOfCards;
    }


    public void addCardIfUnique(Card card) throws IllegalArgumentException {
        if (this.getListOfCards().contains(card)) {
            throw new IllegalArgumentException("Такая карточка уже есть!");
        } else {
            this.getListOfCards().add(card);
        }
    }

    public void createAndAddCard() {
        Card card = createCard();
        boolean inputIsSet;
        try {
            this.addCardIfUnique(card);
        } catch (IllegalArgumentException e) {
            System.out.println("Такая карточка уже есть. Перезаписать?");
            System.out.println("1) да");
            System.out.println("2) нет");
            do {
                inputIsSet = false;
                int input = readInt();
                if (input == 1) {
                    this.getListOfCards().add(card);
                    System.out.println("Карточка успешно перезаписана.");
                    inputIsSet = true;
                } else if (input == 2) {
                    System.out.println("Карточка не добавлена.");
                    inputIsSet = true;
                } else {
                    System.out.println("Введите 1 или 2!");
                }

            } while (!inputIsSet);

        }

    }

    public void addMore() {

        boolean inputIsSet;
        System.out.println("Добавить еще?");
        System.out.println("1) да");
        System.out.println("2) нет");
        do{
            inputIsSet = false;
            int input = readInt();
            if (input == 1) {
                this.createAndAddCard();
                System.out.println("Добавить еще?");
                System.out.println("1) да");
                System.out.println("2) нет");
            } else if (input == 2) {
                System.out.println("Все карточки добавлены!");
                inputIsSet = true;
            } else {
                System.out.println("Введите 1 или 2!");
            }
        } while (!inputIsSet);
    }

    public void addCards() {
        this.createAndAddCard();
        this.addMore();

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(name, deck.name) && Objects.equals(listOfCards, deck.listOfCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listOfCards);
    }
}
