import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class BinsTest {
    private Bins bins;
    @Before
    public void setUp(){
        bins = new Bins(2,12);
    }
    @Test
    public void constructorAndGetTest(){
        Stream
                .iterate(2,q -> q+1)
                .limit(12)
                .forEach(q-> Assert.assertEquals(Integer.valueOf(0), bins.getBin(q)));
    }
    @Test
    public void incrementTest(){
        bins.increment(2);
        Assert.assertEquals(Integer.valueOf(1),bins.getBin(2));
    }


}
