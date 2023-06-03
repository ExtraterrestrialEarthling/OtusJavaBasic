package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private List<Deck> decks;

    public User(String name) {
        this.name = name;
        this.decks = new ArrayList<>();
    }

    public Deck newDeck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название колоды:");
        String name = scanner.nextLine();
        Deck deck = new Deck(name);
        this.decks.add(deck);
        return deck;
    }

    public List<Deck> getDecks() {
        return this.decks;
    }

    public static User createUser() {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        User user = new User(name);

        try (MyDataBaseStream stream = new MyDataBaseStream()) {
            stream.saveUser(user);
        }
        return user;
    }

    public void learn(Deck deck){
        for (Card card : deck.getListOfCards()){
            System.out.println("Переведите слово:");
            System.out.println(card.getFront());
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase(card.getBack())){
                System.out.println("Правильно!");
            } else{
                System.out.println("Неверно! Правильный ответ:");
                System.out.println(card.getBack());
            }
        }
    }


    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e1) {
                //подавляем исключение
            }
            return -1;
    }
}
