import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int userInputNumber = Integer.parseInt(scannerObject.nextLine());
        
        if (userInputNumber > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
