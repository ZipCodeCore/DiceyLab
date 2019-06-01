public class Simulation {

    private int numberOfReps;
    private Dice dice;
    private Bins bins;

    public Simulation(int numberOfDice, int numberOfReps){
        this.numberOfReps = numberOfReps;
        dice = new Dice(numberOfDice);
        bins = new Bins(dice);
    }

    public void runSim(){
        for(int i = 0; i < numberOfReps; i++){
            bins.incrementBin(dice.roll());
        }
    }

    public String printSim(){
        // String format should be more flexible
        StringBuilder sbuild = new StringBuilder();
        for(int i = bins.getMinValue(); i <= bins.getMaxValue(); i++){
            sbuild.append(String.format("%2d:%8d:%5.2f %s\n",i,bins.getBinValue(i),
                    (bins.getBinValue(i)*1.0)/(numberOfReps*1.0),getStars(i)));
        }
        return sbuild.toString();
    }

    public String getStars(int binNumber){
        StringBuilder sbuild = new StringBuilder();
        //int value = bins.getBinValue(binNumber);

        for(int i = 0; i < bins.getBinValue(binNumber)/10000; i++){
            sbuild.append('*');
        }

        return sbuild.toString();
    }




}
