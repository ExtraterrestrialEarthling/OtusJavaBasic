package homework6;

import java.util.Scanner;


public class EnglishCardsApp {
    public static void main(String[] args) {
        User user = User.createUser();
        Deck userDeck = user.newDeck();
        userDeck.addCards();
        user.learn(userDeck);



    }









}
