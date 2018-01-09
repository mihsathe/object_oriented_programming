import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type a year: ");
        int userInputYear = Integer.parseInt(scannerObject.nextLine());
        
        if ((userInputYear % 400) == 0) {
            System.out.println("The year is a leap year.");
        } else if (((userInputYear % 4 == 0) && ((userInputYear % 100) != 0))) {
            System.out.println("The year is a leap year.");
        }
        else {
            System.out.println("The year is not a leap year.");
        }
    }
}
