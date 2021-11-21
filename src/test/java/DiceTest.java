import org.junit.Assert;
import org.junit.Test;

public class DiceTest{

    @Test
    public void diceConstructorTest() {
        //Given
        Integer expectedNumOfDie = 8;

        //When
        Dice dice = new Dice(expectedNumOfDie);
        Integer actual = dice.getNumOfDie();

        //Then
        Assert.assertEquals(expectedNumOfDie, actual);
    }

    @Test
    public void tossAndSumTwoDiceTest() {
        //Given
        Dice dice = new Dice(2);

        //When
        Integer toss = dice.tossAndSum();

        //Then
        Assert.assertTrue((toss > 1) && (toss < 13));
    }

    @Test
    public void tossAndSumFiveDiceTest() {
        //Given
        Dice dice = new Dice(5);

        //When
        Integer toss = dice.tossAndSum();

        //Then
        Assert.assertTrue((toss > 4) && (toss < 31));
    }
}
