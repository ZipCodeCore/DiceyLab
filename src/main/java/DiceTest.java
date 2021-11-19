import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;



public class DiceTest {
    @Test
    public void testDiceTossAndAdd(){
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        int actual = dice.tossAndAdd();
        assertTrue(actual >= 1 && actual <= 13);
    }

}