import java.util.ArrayList;
import java.util.List;

public class Simulation {

    int numOfDice;
    int numOfRolls;
    Dice dice;
    Bins bins;

    public Simulation(int numOfDice, int numOfRolls) {
        this.numOfDice = numOfDice;
        this.numOfRolls = numOfRolls;
    }

    public void runSimulation(){
        int result;
        this.bins = new Bins(numOfDice, numOfDice * 6);
        this.dice = new Dice(numOfDice);
        for(int i = 0; i < numOfRolls; i++) {
            result = dice.tossAndSum();
            bins.incrementBin(result);
        }
        System.out.println("");
    }

    public void printResults() {
        for(int i = numOfDice; i <= numOfDice * 6; i++) {
            Double percentage = (double) bins.getBin(i) / numOfRolls;
            System.out.printf(
                    "%2d : %7d: %.2f ", i, bins.getBin(i), percentage);
            for(int j = 1; j < percentage * 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public double getPercentage(int numOfRolls, Bins bins) {
        double percentage = 0;
        for(int element : bins.getBins()) {
            percentage = ((double) element / numOfRolls);
        }
        return percentage;
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }

}
