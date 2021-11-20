import org.junit.Assert;
import org.junit.Test;

public class DiceTest{

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
