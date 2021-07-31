import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DiceTest {

    @Test
    public void testGetNumberOfDice() {
        int expected = 2;

        Dice die = new Dice(expected);
        int actual = die.getNumberOfDie();

        Assertions.assertEquals(expected, actual);

    }
}
