import java.util.HashMap;
import java.util.Map;

public class Bins {
    private Integer lower;
    private Integer upper;

    private Map<Integer, Integer> binsMap = new HashMap<>();

    public Bins(Integer lower, Integer upper) {
        this.lower = lower;
        this.upper = upper;

        for (int i = lower; i <= upper; i++) {
            binsMap.put(i, 0);
        }
    }

    public Integer getBin(int bin) {
        return binsMap.get(bin);
    }

    public void incrementBin(int bin) {
        binsMap.put(bin, getBin(bin)+1);
    }
}
