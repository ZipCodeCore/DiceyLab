import java.util.Map;

public class Simulation {
    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public Bins runSimulation(){
        Dice dice = new Dice(numberOfDies);
        bins = new Bins(numberOfDies, numberOfDies*6);
        Integer total;

        for (int i = 0; i < numberOfTosses; i++) {
           total = dice.tossAndSum();
           bins.incrementBin(total);
        }
        return bins;
    }

    public void printResults(){
       for (Map.Entry value : bins.getBinMap().entrySet()){
           System.out.println(value);
       }
    }


}
