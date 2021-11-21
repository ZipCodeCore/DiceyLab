import java.util.ArrayList;
import java.util.List;

public class Dice {
    private static class Die{
        private int result;
        private Die(){
            this.result =(int) (Math.random()*(6 - 1 + 1) + 1);
        }
        private int roll(){
            return (this.result = (int) (Math.random()*(6 - 1 + 1) + 1));
        }
    }
    private List<Die> dice = new ArrayList<>();
    public Dice(int numberOfDice){
        for (int i = 0; i < numberOfDice; i++) {
            this.dice.add(new Die());
        }
    }
    public int tossAndSum(){
        int sum = 0;
        for (int i = 0; i < dice.size(); i++) {
            sum += this.dice.get(i).roll();
        }
        return sum;
    }
    public List<Die> getDice(){
        return dice;
    }


}
