package homework7;

import homework7.fake.LuckyDice;
import homework7.fake.SpyWinnerConsolePrinter;
import homework7.fake.WinnerAlwaysFirstDice;
import homework7.game.*;

public class GameTest {
    public static void higherDiceRollShouldWin(){
        String scenario = "Игрок с бОльшим значением броска побеждает.";

        Player player1 = new Player("Петя");
        Player player2 = new Player("Влада");

        WinnerAlwaysFirstDice dice = new WinnerAlwaysFirstDice();
        SpyWinnerConsolePrinter winnerPrinter = new SpyWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
            game.playGame(player1, player2);
            if (winnerPrinter.getOutput().equals(player1.getName())) {
                System.out.println(scenario + " - Тест пройден!");
            } else {
                System.err.println(scenario + " - Тест провален!");
            }


    }



    public static void equalDiceRollsShouldResultInTie(){
        String scenario = "При равном результате броска кубиков программа должна выдавать \"Ничья\".";

        Player player1 = new Player("Ваня");
        Player player2 = new Player("Рита");

        Dice dice = new LuckyDice();
        SpyWinnerConsolePrinter winnerPrinter = new SpyWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(player1, player2);
        if(winnerPrinter.getOutput().equalsIgnoreCase("Ничья")){
            System.out.println(scenario + " - Тест пройден!");
        } else{
            System.err.println(scenario + " - Тест провален!");
        }
    }

    public static void methodPrintWinnerShouldBeCalled(){
        String scenario = "Метод printWinner должен быть вызван.";
        Dice dice = new LuckyDice();
        SpyWinnerConsolePrinter winnerPrinter = new SpyWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Витя"), new Player("Алёна"));
            if (winnerPrinter.methodIsCalled()) {
                System.out.println(scenario + " - Тест пройден!");
            } else {
                System.err.println(scenario + " - Тест провален!");
            }

    }



}
