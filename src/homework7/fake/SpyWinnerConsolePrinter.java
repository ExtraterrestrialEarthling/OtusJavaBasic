package homework7.fake;


import homework7.game.GameWinnerPrinter;
import homework7.game.Player;

public class SpyWinnerConsolePrinter implements GameWinnerPrinter {
    private String output;
    private boolean methodCalled;

    @Override
    public void printWinner(Player winner) {
        methodCalled = true;
        output = winner.getName();
    }

    public String getOutput() {
        return output;
    }

    public boolean methodIsCalled(){
        return methodCalled;
    }
}
