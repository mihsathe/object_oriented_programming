import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String userInputPassword = scannerObject.nextLine();
            
            if (userInputPassword.equals(password)) {
                System.out.println("Right\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
