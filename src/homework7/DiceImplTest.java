package homework7;


import homework7.game.Dice;
import homework7.game.DiceImpl;

public class DiceImplTest {

    public static void diceShouldBeInRange() {
        String scenario = "Результат броска кубика должен быть в пределах допустимых значений (1-6).";
        Dice dice = new DiceImpl();
        int result = dice.roll();
        boolean failed = false;
        for(int i = 0; i<1000; i++){
            if(result<=0||result>6){
                failed = true;
                break;
            }
        }
        if(!failed){
            System.out.println(scenario + " - Тест пройден!");
        } else{
            System.err.println(scenario + " - Тест провален!");
        }
    }

    public static void diceShouldBeInteger(){
String scenario = "Результат броска кубика должен быть целочисленным значением.";
        Dice dice = new DiceImpl();
        var result = dice.roll();
        if(result-Math.floor(result)==0){
            System.out.println(scenario + " - Тест пройден!");
        } else{
            System.err.println(scenario + " - Тест провален!");
        }


    }
}
