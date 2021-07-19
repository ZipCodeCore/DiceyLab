import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testGetNumberOfDice() {
        //given
        int expected = 2;
        //when
        Dice dice = new Dice(expected);
        int actual = dice.getNumberOfDice();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTossAndSum() {
        //given
        int numOfDice = 2;
        int expected = 8;
        Dice dice = new Dice(2);
        //when
        int actual = dice.tossAndSum();
        //then
        System.out.println(actual);
    }
}


// need number of dice
// need to roll dice
// need sum of dice
