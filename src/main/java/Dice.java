public class Dice {

    private int numberOfDie;

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


}