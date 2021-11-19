

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {

@Test
 public void getBins(){
 //given
      Bins bins = new Bins(2,12);

      //when
      int actual = bins.getBin(4);

      //Then
     Assertions.assertEquals(0,actual);
}

@Test
    public void incrementTest(){
    //given
    Bins bins = new Bins(2,12);
    int expected = 2;
    bins.incrementBin(10);
    bins.incrementBin(10);
    assertEquals(expected, bins.getBin(10));
}

}