


public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfTosses;

    public Simulation(Integer numberOfDice , Integer numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    public static void main(String[] args){
        Simulation simulation = new Simulation(2,10000);
        simulation.printResults(simulation.runSimulation());
    }

    private Bins runSimulation(){
        Dice dice = new Dice(numberOfDice);
        Integer maxValue = numberOfDice * 6;
        Bins bins = new Bins(numberOfDice, maxValue);
        for (int i = 0; i < numberOfTosses ; i++) {
            bins.incrementBin(dice.tossAndAdd());

        }
        return bins;
    }

    private void printResults(Bins bins){
        Integer maxValue = numberOfDice * 6;
        for (int i = numberOfDice; i < maxValue ; i++) {
            System.out.println(String.format("%2d : %4d : %1.2f    ",i, bins.getBin(i),binPercent(bins.getBin(i))));
            printHash(binPercent(bins.getBin(i)));
            System.out.println();
        }
    }
    public void printHash(Double Value){
        int numberOfHash = (int)(Value * 100);
        for (int i = 1; i <= numberOfHash ; i++) {
            System.out.print(" # ");

        }
    }
    public Double binPercent(Integer Value){
        return Double.valueOf(Value) /numberOfTosses;
    }

}
