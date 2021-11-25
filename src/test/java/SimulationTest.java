import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {
    @Test
    public void constructorTest(){
     //given
     Simulation simulation = new Simulation(2, 1000000);
     Integer expectedNumberOfDies = 2;
     Integer expectedNumberOfTosses = 1000000;
     //when
     Integer actualNumberOfDies = simulation.getNumberOfDies();
     Integer actualNumberOfTosses = simulation.getNumberOfTosses();
     //then
     Assert.assertEquals(expectedNumberOfDies, actualNumberOfDies);
     Assert.assertEquals(expectedNumberOfTosses, actualNumberOfTosses);
    }


}
