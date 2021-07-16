public class Simulation {
    public static void main(String[] args) {
        runSimXtimes(2, 1000000);
    }



public static void runSimXtimes(Integer numberOfDice, Integer numOfToss){
        Dice dicey = new Dice(numberOfDice);
        Bins binss = new Bins(numberOfDice, numberOfDice * 6);

          for (int i = 0; i < numOfToss; i++){
              binss.incrementBins(dicey.tossAndSum());
          }


    printIt();
}

    public static void printIt (){
  String purple = "";
  String red = "";
   for (int i = 0; i < Bins.boxes.length; i++){
       if (i < 3) {
           red = " ";
       } else {
           red = "";
       }
       Double result = Bins.boxes[i] / 1000000.0;
       purple += (i + 2) + ":  " + Bins.boxes[i] + red + "   :  " + String.format("%.2f", result) + " ";
       for (int j = 0; j < (result * 100) - 1; j++){
           purple += "*";
       }
       purple += "\n";
   }
        System.out.println(purple);
    }

}
//    private Bins bin;
//    private Dice dice;
//    private Integer min;
//    private Integer max;
//    private Integer numOFDice;
//    private Integer numOfToss;
//
//    public Simulation(Integer numOFDice, Integer numOfToss) {
//        this.bin = new Bins(numOFDice, numOFDice * 6);
//        this.dice = new Dice(numOFDice);
//        this.min = numOFDice;
//        this.numOFDice = numOFDice;
//        this.numOfToss = numOfToss;
//    }