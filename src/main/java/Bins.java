import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bins {
    Map<Integer,Integer> binmap;
    public Bins(int min , int max){
        this.binmap = Stream
                .iterate(min,q -> q + 1)
                .limit(max)
                .collect(Collectors.toMap( q -> q, q-> 0));
    }
    public Integer getBin(int bin){
        return this.binmap.get(bin);
    }
    public void increment(int bin){
        this.binmap.replace(bin,this.binmap.get(bin)+1);
    }

}
