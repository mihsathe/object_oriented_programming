import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int userInputNumber = Integer.parseInt(scannerObject.nextLine());
        
        if ((userInputNumber % 2) == 0) {
            System.out.println("Number " + userInputNumber + " is even.");
        } else {
            System.out.println("Number " + userInputNumber + " is odd.");
        }
    }
}
