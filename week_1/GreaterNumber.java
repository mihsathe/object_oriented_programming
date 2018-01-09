import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int firstNumber = Integer.parseInt(scannerObject.nextLine());
        System.out.print("Type the second number: ");
        int secondNumber = Integer.parseInt(scannerObject.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equals!!");
        } else {
            System.out.println("Greater number: " + secondNumber);
        }
    }
}
