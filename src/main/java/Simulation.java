public class Simulation {

    public static void main(String[] args) {
        Simulation simulate = new Simulation();

        simulate.simulate2Dice(1000000);


    }

    public void simulate2Dice(int timesToSimulate) {
        int counter = 0;
        Bins results = new Bins();
        while (counter < timesToSimulate) {
            results.storeBin(Dice.diceToss2());
            counter++;
        }
        System.out.println("***");
        System.out.println(String.format("Simulation of 2 dice tossed for %d times.", timesToSimulate));
        System.out.println("***\n");
        System.out.println(String.format(" 2 : %8d: %5.2f **", results.two, (double)results.two/timesToSimulate));
        System.out.println(String.format(" 3 : %8d: %5.2f *****", results.three, (double)results.three/timesToSimulate));
        System.out.println(String.format(" 4 : %8d: %5.2f ********", results.four, (double)results.four/timesToSimulate));
        System.out.println(String.format(" 5 : %8d: %5.2f ***********", results.five, (double)results.five/timesToSimulate));
        System.out.println(String.format(" 6 : %8d: %5.2f *************", results.six, (double)results.six/timesToSimulate));
        System.out.println(String.format(" 7 : %8d: %5.2f ****************", results.seven, (double)results.seven/timesToSimulate));
        System.out.println(String.format(" 8 : %8d: %5.2f *************", results.eight, (double)results.eight/timesToSimulate));
        System.out.println(String.format(" 9 : %8d: %5.2f ***********", results.nine, (double)results.nine/timesToSimulate));
        System.out.println(String.format("10 : %8d: %5.2f ********", results.ten, (double)results.ten/timesToSimulate));
        System.out.println(String.format("11 : %8d: %5.2f *****", results.eleven, (double)results.eleven/timesToSimulate));
        System.out.println(String.format("12 : %8d: %5.2f **", results.twelve, (double)results.twelve/timesToSimulate));

    }

}
