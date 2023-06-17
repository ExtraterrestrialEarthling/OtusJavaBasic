package homework7.fake;

import homework7.game.Dice;

public class WinnerAlwaysFirstDice implements Dice {
    private boolean methodCalledFirstTime = true;
    @Override
    public int roll() {
        int result = methodCalledFirstTime ? 6 : 1;
        methodCalledFirstTime = false;
        return result;
    }
}
