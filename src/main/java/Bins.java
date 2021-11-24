import java.util.Map;
import java.util.TreeMap;

public class Bins {
    private Integer binLow;
    private Integer binHigh;
    private Map<Integer, Integer> binMap = new TreeMap<>();

    public Bins(Integer binLow, Integer binHigh) {
        this.binLow = binLow;
        this.binHigh = binHigh;

        for (int i = binLow; i < binHigh ; i++) {
            binMap.put(i,0);
        }
    }
public Integer getBin(Integer binNum){
        return binMap.get(binNum);
}

    public Map<Integer, Integer> getBinMap() {
        return binMap;
    }

    public void incrementBin(Integer binNum){
    Integer qty = binMap.containsKey(binNum) ? binMap.get(binNum) : 0;
    qty++;
     binMap.put(binNum,qty);
}

}
