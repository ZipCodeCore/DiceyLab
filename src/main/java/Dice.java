public class Dice {
    private int numberOfDice;

    public Dice(int numberDice) {
        this.numberOfDice = numberDice;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        int minimum = 1;
        int maximum = 7;

        for (int i = 0; i < numberOfDice; i++) {
             sum +=  minimum + (int)(Math.random() * (maximum - minimum));

        }
        return sum;
    }
}
