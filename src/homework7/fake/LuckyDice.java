package homework7.fake;

import homework7.game.Dice;

public class LuckyDice implements Dice {
    @Override
    public int roll() {
        return 6;
    }
}
