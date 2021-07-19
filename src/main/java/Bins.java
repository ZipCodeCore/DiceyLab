import java.util.Arrays;

public class Bins {

    int min;
    int max;
    Integer[] bins;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        bins = new Integer[max - min + 1];
        Arrays.fill(bins, 0);
    }

    public int getBin(int binNumber) {
        return bins[binNumber - min];
    }

    public int incrementBin(int binNumber) {
        return bins[binNumber - min]++;
    }

    public Integer[] getBins() {
        return bins;
    }
}

