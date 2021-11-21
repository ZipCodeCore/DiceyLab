import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void constructorTest(){
        //when
        Dice dice = new Dice(2);
        //then
        Assert.assertEquals(2,dice.getDice().size());
    }
    @Test
    public void tossAndSumTest(){
        //given
        Dice dice = new Dice(2);
        Assert.assertTrue(dice.tossAndSum() >= 2 && dice.tossAndSum() <= 12);
    }

}
