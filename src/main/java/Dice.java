import java.util.Random;

public class Dice {

    int numberOfDice;


    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int tossAndSum() {
        int sumOfDice = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sumOfDice += rollDie();
        }
        return sumOfDice;
    }

    private int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    public  int getNumberOfDice(){
        return numberOfDice;
    }
    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

}
