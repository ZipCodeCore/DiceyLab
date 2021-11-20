public class Simulation {
    private Integer numberOfDie;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfTosses;
    }

    public Integer getNumOfDie() {
        return this.numberOfDie;
    }

    public Integer getNumOfTosses() {
        return this.numberOfTosses;
    }

    public Bins runSimulation() {
        Dice dice = new Dice(numberOfDie);
        bins = new Bins(numberOfDie, numberOfDie*6);
        Integer result;

        for (int i = 0; i < numberOfTosses; i++) {
            result = dice.tossAndSum();
            bins.incrementBin(result);
        }
        return bins;
    }

    public void printResults() {

        System.out.println(new StringBuilder()
                .append("\n***")
                .append("\nSimulation of " + numberOfDie + " dice tossed " + numberOfTosses + " times.")
                .append("\n***")
        + printBins(bins));

    }


    private String printBins(Bins bins) {
        String binLine = "";
        Double binPercent;
        Integer stars = 0;

        for(int i = numberOfDie; i <= (numberOfDie*6); i++) {
            binPercent = ((double) bins.getBin(i)) / numberOfTosses;
            binLine += String.format("\n%2d : %8d : %.2f ", i, bins.getBin(i), binPercent);

            stars = (100 * bins.getBin(i)) / numberOfTosses;

            for (int j = 0; j < stars; j++) {
                binLine += "*";
            }
        }
        return binLine;
    }


}
