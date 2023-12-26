package projectwork;

public enum NumbersEnum {
    ZERO("", 0),
    ONE("один", 1),
    TWO("два", 2),
    THREE("три", 3),
    FOUR("четыре", 4),
    FIVE("пять", 5),
    SIX("шесть", 6),
    SEVEN("семь", 7),
    EIGHT("восемь", 8),
    NINE("девять", 9),
    TEN("десять", 10),
    ELEVEN("одиннадцать", 11),
    TWELVE("двенадцать", 12),
    THIRTEEN("тринадцать", 13),
    FOURTEEN("четырнадцать", 14),
    FIFTEEN("пятнадцать", 15),
    SIXTEEN("шестнадцать", 16),
    SEVENTEEN("семнадцать", 17),
    EIGHTEEN("восемнадцать", 18),
    NINETEEN("девятнадцать", 19),
    TWENTY("двадцать", 20),
    THIRTY("тридцать", 30),
    FORTY("сорок", 40),
    FIFTY("пятьдесят", 50),
    SIXTY("шестьдесят", 60),
    SEVENTY("семьдесят", 70),
    EIGHTY("восемьдесят", 80),
    NINETY("девяносто", 90),
    HUNDRED("сто", 100),
    TWO_HUNDRED("двести", 200),
    THREE_HUNDRED("триста", 300),
    FOUR_HUNDRED("четыреста", 400),
    FIVE_HUNDRED("пятьсот", 500),
    SIX_HUNDRED("шестьсот", 600),
    SEVEN_HUNDRED("семьсот", 700),
    EIGHT_HUNDRED("восемьсот", 800),
    NINE_HUNDRED("девятьсот", 900),
    THOUSAND("тысяча", 1000);



    private final String representation;
    private final int index;


    NumbersEnum(String representation, int index) {
        this.representation = representation;
        this.index = index;

    }

    public int getIndex(){
        return this.index;
    }

    public static String getRepresentation(int index) {
        for (NumbersEnum x : values()){
            if (x.getIndex() == index){
                return x.representation;
            }

        }
        return null;
    }

}