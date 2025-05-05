public class Dice {
    public int faceValue;

    public Dice() {
        this.faceValue = (int)((Math.random() * 6) + 1);
    }

    public static Integer diceToss2() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        return dice1.faceValue + dice2.faceValue;
    }

//    public static Integer diceToss5() {
//        Dice dice1 = new Dice();
//        Dice dice2 = new Dice();
//        Dice dice3 = new Dice();
//        Dice dice4 = new Dice();
//        Dice dice5 = new Dice();
//
//        return dice1.faceValue + dice2.faceValue + dice3.faceValue + dice4.faceValue + dice5.faceValue;
//    }



}
