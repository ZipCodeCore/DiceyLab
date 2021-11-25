import java.util.Map;

public class Simulation {
    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public Bins runSimulation() {
        Dice dice = new Dice(numberOfDies);
        bins = new Bins(numberOfDies, numberOfDies * 6);
        Integer total;

        for (int i = 0; i < numberOfTosses; i++) {
            total = dice.tossAndSum();
            bins.incrementBin(total);
        }
        return bins;
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.");
        System.out.println("***\n");
        for (Map.Entry value : bins.getBinMap().entrySet()) {
            Integer val = (Integer) value.getValue();
            Double percent = Double.valueOf(val) / numberOfTosses;

            String stringFormat = String.format("%2d :  %8d  : %.2f", value.getKey(), value.getValue(), percent);
            System.out.println(stringFormat + " " + printStars(val));

        }
    }

    public String printStars(Integer number) {
        Integer dividedByTenThousand = number / 10000;
        String stars = "";
        for (int i = 0; i < dividedByTenThousand; i++) {
            stars += "*";
        }
        return stars;
    }

    public Integer getNumberOfDies() {
        return numberOfDies;
    }

    public Integer getNumberOfTosses() {
        return numberOfTosses;
    }
}
