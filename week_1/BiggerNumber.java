
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(scannerObject.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(scannerObject.nextLine());
        System.out.println("\nThe bigger number of the two numbers given was: " + Math.max(firstNumber, secondNumber));
    }
}
