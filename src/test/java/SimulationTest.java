import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void simulationConstructorTest() {
        //Given
        Integer numberOfDie = 2;
        Integer numberOfTosses = 10000;

        //When
        Simulation sim = new Simulation(numberOfDie, numberOfTosses);
        Integer actualNumOfDie = sim.getNumOfDie();
        Integer actualNumOfTosses = sim.getNumOfTosses();

        //Then
        Assert.assertEquals(numberOfDie, actualNumOfDie);
        Assert.assertEquals(numberOfTosses, actualNumOfTosses);
    }

}
