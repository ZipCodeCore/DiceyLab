public class Simulation {

    Integer numberOfDice;
    Integer numberOfTosses;
    Dice dice;
    Bins bins;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {
        this.dice = new Dice(2);
        this.bins = new Bins(2, 12);

        for (int i = 0; i < numberOfTosses; i++) {
            Integer sumUp = dice.tossAndSum();
            bins.incrementBins(sumUp);
        }
        System.out.println("");
    }

    public void printResults() {
        for(Integer i = 2; i <= 12; i++) {
            Double percentage = (double) bins.getBinValue(i) / numberOfTosses;
            System.out.printf("%2d : %7d: %.2f ", i, bins.getBinValue(i), percentage);
            for(int j = 1; j < percentage * 100; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public double getPercentage(Integer numberOfTosses, Bins bins) {
        double percentage = 0;
        for( int element : bins.getBins()) {
            percentage = element/ numberOfTosses;
        }
        return percentage;
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }


}
