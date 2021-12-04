import com.sun.nio.sctp.SctpMultiChannel;

import java.util.stream.Stream;

public class Simulation {
    private final Bins bins;
    private final Dice dice;
    private final int rolls;
    private final int numDice;
    public Simulation(int dice, int rolls) {
        this.numDice = dice;
        this.dice = new Dice(dice);
        this.bins = new Bins(dice,dice * 6);
        this.rolls = rolls;
    }
    public void runSimulation(){
        Stream
                .iterate(0,q-> q+1)
                .limit(rolls)
                .forEach(q-> {
                    int bin = dice.tossAndSum();
                    bins.increment(bin);
                });
    }

    public String printResults() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("***\n" + "Simulation of ")
                .append(this.numDice)
                .append(" dice tossed for ")
                .append(this.rolls)
                .append(" times.\n")
                .append("***\n")
                .append("\n");
        Stream
                .iterate(this.numDice,q -> q + 1)
                .limit((this.numDice) * 6L - 1)
                .forEach(q -> {
                    sb
                            .append(String.format("%3s",q))
                            .append(String.format(":%9s",this.bins.getBin(q)))
                            .append(String.format(":%5.2f ", (double)(this.bins.getBin(q))/(double)(this.rolls)));
                    Stream
                            .iterate(0,r->r+1)
                            .limit(this.bins.getBin(q)/10_000)
                            .forEach(r -> sb.append("*"));
                    sb.append("\n");
                });
        return sb.toString();
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1_000_000);
        sim.runSimulation();
        System.out.println(sim.printResults());
    }
}
