
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(scannerObject.nextLine());
        System.out.println("\nCircumference of the circle: " + 2 * Math.PI * radius);        
    }
}
