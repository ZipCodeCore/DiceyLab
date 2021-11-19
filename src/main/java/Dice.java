

public class Dice {
    private Integer numberOnDice;

    public Dice(Integer numberOfDice){
        this.numberOnDice = numberOfDice;
    }

    public int tossAndAdd(){
        int sum = 0;
        for (int i = 0; i < numberOnDice ; i++) {
            sum+= (int) (Math.random() * 6 ) + 1;

        }
        return sum;
    }

    public Integer getNumberOfDice() {
        return numberOnDice;
    }
}
