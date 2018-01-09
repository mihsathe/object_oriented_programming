import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int userInputFactionalNumber = Integer.parseInt(scannerReader.nextLine());
        int initialNumber = 1;
        int product = 1;
        
        while (userInputFactionalNumber != 0) {
            product *= initialNumber;
            
            if (userInputFactionalNumber == initialNumber) {
                break;
            }
            initialNumber++;
        }
        
        if (userInputFactionalNumber == 0) {
            System.out.println("Factional is 1");
        } else {
            System.out.println("Factorial is " + product);
        }
    }
}