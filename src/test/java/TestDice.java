import org.junit.Assert;
import org.junit.Test;

public class TestDice {


    @Test
    public void constructorTest(){
        //given
        Dice dice = new Dice(5);
        Integer expected = 5;

        //when
        Integer actual = dice.getNumberOfDie();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest(){
        //given
        Dice dice = new Dice(2);
        //when
        Integer actual =   dice.tossAndSum();
        //then
       Assert.assertTrue(actual <= 12); // max sum of toss is 12 bec 2 dice * 6
    }
}
