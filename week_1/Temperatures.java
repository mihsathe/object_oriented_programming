
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Type a number: ");
            double userInputNumber = Double.parseDouble(scannerObject.nextLine());
            
            if (userInputNumber <= 40 || userInputNumber >= -30) {
                Graph.addNumber(userInputNumber);
            }
        }
    }
}
