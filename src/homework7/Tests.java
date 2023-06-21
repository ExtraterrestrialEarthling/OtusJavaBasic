package homework7;

import homework7.game.Dice;

public class Tests {
    public static void main(String[] args) {
        DiceImplTest.diceShouldBeInRange();
        GameTest.equalDiceRollsShouldResultInTie();
        DiceImplTest.diceShouldBeInteger();
        GameTest.methodPrintWinnerShouldBeCalled();
        GameTest.higherDiceRollShouldWin();
    }
}
