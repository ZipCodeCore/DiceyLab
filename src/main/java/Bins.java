import java.util.Arrays;

public class Bins {
    private int binMin;
    private int binMax;
    private Integer[] boxes;

    public Bins(int binMin, int binMax) {
        this.binMin = binMin;
        this.binMax = binMax;
        boxes = new Integer[binMax - binMin + 1];
        Arrays.fill(boxes, 0); //populate bins (boxes) with 0's as initial value
    }

    public void incrementBin(int binNum) {
        boxes[binNum - binMin ]++; //binNum - number of dice - raises bin min by 1 each extra dice
    }

    public Integer getBin(int binNum) {
        return boxes[binNum - binMin];
    }

    public Integer[] getBoxes() {
        return boxes;
    }

    public int getBinMin() {
        return binMin;
    }
}
