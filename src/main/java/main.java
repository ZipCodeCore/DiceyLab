public class main {
    public static void main(String[] args) {
        Dice dice = new Dice(5);


        Bins bins = new Bins(2,12);
        bins.incrementBin(3);
        bins.incrementBin(4);
        bins.incrementBin(4);
        bins.incrementBin(4);
        bins.incrementBin(4);
        System.out.println(bins.getBin(3));
        System.out.println(bins.getBin(4));
    }
}
