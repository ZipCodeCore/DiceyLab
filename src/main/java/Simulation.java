import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Simulation {


    public static void main(String[] args) {
        int numDice = 2;
        Dice dice =  new Dice(numDice);
        Bins bin =  new Bins(numDice, numDice*6);

        for (int i = 0; i <1000000; i++) {
            bin.incrementBin(dice.tossAndSum());
        }
         printResults(1000000, bin );
    }

    public static List<Double> tally(Integer numOfTosses, Bins bin) {
        List<Double> percent = new ArrayList<Double>();
        for (Integer element : bin.getBoxes()){
            double tallyPercent = ((double)element / numOfTosses);
            BigDecimal bigD = new BigDecimal(Double.toString(tallyPercent));
            bigD = bigD.setScale(2, RoundingMode.HALF_UP);
            percent.add(bigD.doubleValue()); //adds bigD into percent array
        }
        return percent;
    }

    public static void printResults(Integer numOfTosses, Bins bins){
        List<Double> results =  tally(numOfTosses, bins);
        Integer diceNum = bins.getBinMin();
        Integer numOfStars = 0;
        String printResults = "";

        for (Double element : results) {
            numOfStars = (int)(element * 100);
            printResults += String.format("%3d:   %7d  %1.2f ", diceNum, bins.getBin(diceNum), element);
            for (int j = 1; j < numOfStars; j++) {
                printResults += "*";
            }
            diceNum++;
            printResults += "\n";
        }
        System.out.println(printResults);


    }



}
