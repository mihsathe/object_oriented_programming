import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("How old are you? ");
        int userInputNumber = Integer.parseInt(scannerObject.nextLine());
        
        if (userInputNumber >= 0 && userInputNumber <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
