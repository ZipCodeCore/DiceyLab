import java.util.ArrayList;
import java.util.Random;

public class Dice {

    int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Dice() {}

    public int getNumberOfDice() {
        return numOfDice;
    }

    public int tossAndSum() {
        int sum = 0;
        for(int i = 0; i < numOfDice; i++) {
            sum += (Math.random() * 6) + 1;
        }
        return sum;
    }
}
