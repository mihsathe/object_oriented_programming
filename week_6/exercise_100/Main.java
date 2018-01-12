
public class Main {

    public static void main(String[] args) {
        NightSky test = new NightSky(8, 5);
        test.print();
        System.out.println("Number of stars: " + test.starsInLastPrint());
        
        System.out.println("");
        test.print();
        System.out.println("Number of stars: " + test.starsInLastPrint());
    }
}
