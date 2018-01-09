import java.util.Scanner;
public class Adder {
    
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(scannerObject.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(scannerObject.nextLine());
        int result =  firstNumber + secondNumber;
        System.out.println("\nSum of the numbers: " + result);
    }
}
