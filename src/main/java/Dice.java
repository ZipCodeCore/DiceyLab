public class Dice {


    // private static final int MAX_VALUE = 6;
    private int numberOfDie;
    int[] allTossedDice;


    public static void main(String[] args) {
        Dice die = new Dice(1);

        Integer toss = die.tossAndSum();

        System.out.println(toss);

    }

    public Dice(int numberOfDice) {
        numberOfDie = numberOfDice;
    }

    public int tossAndSum() {
        int sumOfDice = 0;
        for (int i = 0; i < numberOfDie; i++) {
            sumOfDice += rollDie();
        }

        return sumOfDice;
    }

    public int rollDie() {

        return (int) (Math.random() * 6 + 1);
    }

    public int getNumberOfDie() {
        return numberOfDie;
    }

    public void setNumberOfDie(int numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

/*
    public String toString()
    {
        String result = Integer.toString(faceValue);
        return result;
    }
*/


}
