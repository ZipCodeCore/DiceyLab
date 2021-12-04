import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    private final List<Die> dice;
    public Dice(int numberOfDice){
        dice = Stream
                .generate(Die::new)
                .limit(numberOfDice)
                .collect(Collectors.toList());
    }
    public int tossAndSum(){
        return dice.stream()
                .mapToInt(Die::roll)
                .sum();
    }
    public List<Die> getDice(){
        return dice;
    }


}
