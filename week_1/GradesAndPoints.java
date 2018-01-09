import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int userInputNumber = Integer.parseInt(scannerObject.nextLine());
        
        if (userInputNumber < 30) {
            System.out.println("Grade: failed");
        } else if (userInputNumber < 35) {
            System.out.println("Grade: 1");
        } else if (userInputNumber < 40) {
            System.out.println("Grade: 2");
        } else if (userInputNumber < 45) {
            System.out.println("Grade: 3");
        } else if (userInputNumber < 50) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}
