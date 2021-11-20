import java.util.Random;

public class Dice {
    private Integer numberOfDie;

    public Dice(int numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

    public Integer tossAndSum() {
        Random random = new Random();
        Integer sum = 0;

        for (int i = 0; i < numberOfDie; i++) {
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }

    public Integer getNumOfDie() {
        return this.numberOfDie;
    }
}
