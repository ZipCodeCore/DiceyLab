import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void incrementBinTest() {
        //Given
        Bins bins = new Bins(2, 12);
        Integer expected = 1;

        //When
        bins.incrementBin(10);
        Integer actual = bins.getBin(10);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binsConstructorTest() {
        //Given
        Integer lower = 2;
        Integer upper = 12;
        Integer expected = 0;

        //When
        Bins bins = new Bins(lower, upper);
        Integer actual = bins.getBin(2);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
