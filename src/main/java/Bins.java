import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bins {

    Integer[] bins;
    Integer min;
    Integer max;

    public Bins(Integer min, Integer max) {
        bins = new Integer[max - min + 1];
        this.min = min;
        this.max = max;
        Arrays.fill(bins, 0);
    }

    // looking for one index array [6]
    public Integer getBinValue(Integer diceRoll) {

        return bins[diceRoll - min];
    }

    public Integer[] getBins() {
        return bins;
    }

    public Integer incrementBins(Integer diceRoll) {
        return bins[diceRoll - min] ++;
    }
}
