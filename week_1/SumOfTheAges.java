
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstUserName = scannerObject.nextLine();
        System.out.print("Type your age: ");
        int firstUserAge = Integer.parseInt(scannerObject.nextLine());
        System.out.print("\nType your name: ");
        String secondUserName = scannerObject.nextLine();
        System.out.print("Type your age: ");
        int secondUserAge = Integer.parseInt(scannerObject.nextLine());
        System.out.println("\n" + firstUserName + " and " + secondUserName + " are " + (firstUserAge + secondUserAge) + " years old in total.");
    }
}
