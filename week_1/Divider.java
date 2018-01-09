
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type a number ");
        int firstNumber = Integer.parseInt(scannerObject.nextLine());
        System.out.print("Type another number ");
        int secondNumber = Integer.parseInt(scannerObject.nextLine());
        double result = (double) firstNumber / secondNumber;
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + result);
    }
}
