import java.util.ArrayList;
import java.util.List;

public class Dice {

    Integer numDice;
    Integer sumOfDice;



    private List<Integer> diceContainer = new ArrayList<Integer>();

public Dice (Integer numDice){
    this.numDice = numDice;
}



public int tossAndSum(){
    int max =7;
    int min = 1;
    int sum =0;
    for(int i=0; i <numDice; i++){
        sum+=(int) ((Math.random() * (max - min)) + min); // para cuando necesite un random #
    }
    return sum;
}

}
//    public Integer getNumDice() {
//        return numDice;
//    }
//
//    public void setNumDice(Integer numDice) {
//        this.numDice = numDice;
//    }
//
//    public Integer getSumOfDice() {
//        return sumOfDice;
//    }
//
//    public void setSumOfDice(Integer sumOfDice) {
//        this.sumOfDice = sumOfDice;
//    }
//
//    public List<Integer> getDiceContainer() {
//        return diceContainer;
//    }
//
//    public void setDiceContainer(List<Integer> diceContainer) {
//        this.diceContainer = diceContainer;
//    }