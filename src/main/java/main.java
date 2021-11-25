public class main {
    public static void main(String[] args) {
        Dice dice = new Dice(5);

        Simulation simulation = new Simulation(2, 1_000_000);
        simulation.runSimulation();
        simulation.printResults();
    }
}
