import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Dice {
    private Integer numberOfDie;


    public Dice(int numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

    public Integer tossAndSum(){
      int random;
      Integer sum = 0;
        for (int i = 0; i < numberOfDie; i++) {
            random = ThreadLocalRandom.current().nextInt(1,6);
            sum += random;
        }
       return sum;
    }

    public Integer getNumberOfDie() {
        return numberOfDie;
    }
}
