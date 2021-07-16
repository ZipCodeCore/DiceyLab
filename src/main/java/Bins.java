
public class Bins {
    private final Integer min;
    private final Integer max;
    static Integer[] boxes;


    public Bins (Integer min, Integer max){
        this.min = min;
        this.max= max;
        this.boxes = new Integer[(max - min) +1];

           for (int i = 0; i < boxes.length; i++){
               boxes[i] = 0;
        }
    }
public Integer getBins(Integer binNum){
        return boxes[binNum - min];
}

public void incrementBins(Integer binNum){
        boxes[binNum - min]++;
      // the same ^^
//        int index = binNum -min;
//        boxes[index]++;
}


}
