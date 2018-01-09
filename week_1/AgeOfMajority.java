import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int userInputNumber = Integer.parseInt(scannerObject.nextLine());
        
        if (userInputNumber >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
