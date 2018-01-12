import java.util.Random;

public class NightSky {
    
    private double density;
    private double width;
    private double height;
    private int starsInLastPrint;
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    public void printLine() {
        Random random = new Random();
        double probabilityStarOrSpace;
        
        for (int count = 0; count < this.width; count++) {
            probabilityStarOrSpace = random.nextDouble();
            
            if (probabilityStarOrSpace < this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        
        System.out.println("");
    }
    
    public void print() {
        this.starsInLastPrint = 0;
        
        for (int count = 0; count < this.height; count++) {
            printLine();
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}