import java.util.HashMap;
import java.util.Map;

public class Bins {

    Map<Integer , Integer> mapBins = new HashMap<>();
    private Integer minimumNumber;
    private Integer maximumNumber;

    public Bins(int minimumNumber, int maximumNumber){
        this.minimumNumber = minimumNumber;
        this.maximumNumber= maximumNumber;
        for (int i = minimumNumber; i <= maximumNumber ; i++) {
            mapBins.put(i,0);

        }
    }

    public Integer getBin(int binNumber){
        return mapBins.get(binNumber);
    }

    public void incrementBin(Integer binNumber){
        if(binNumber >=this.minimumNumber && binNumber <= this.maximumNumber){
            Integer currentResult = this.getBin(binNumber);
            this.mapBins.put(binNumber , currentResult + 1);
        }
    }
}
