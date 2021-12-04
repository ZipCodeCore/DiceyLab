import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimulationTest {
    private Simulation sim;
    @Before
    public void setUp(){
        sim = new Simulation(2,1_000_000);
    }
    @Test
    public void simulatorTest(){
        sim.runSimulation();
        Assert.assertNotNull(sim.printResults());
    }
}
