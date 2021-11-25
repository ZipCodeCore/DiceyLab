import org.junit.Assert;
import org.junit.Test;

public class TestBins {

    @Test
    public void constructorTest(){
     //given
     Bins bins = new Bins(2, 12);
     Integer expectedSize= 11;
     //when
     Integer actualSize = bins.getBinMap().size();
     //then
       Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void incrementBinTest(){
     //given
      Bins bins = new Bins(2, 12);
      Integer expected = 1;
     //when
        bins.incrementBin(2);
       Integer actual = bins.getBin(2);
    //then
      Assert.assertEquals(expected, actual);

    }



}
