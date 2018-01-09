import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Type your username: ");
        String userInputName = scannerObject.nextLine();
        System.out.print("Type your password: ");
        String userInputPassword = scannerObject.nextLine();
        
        if (userInputName.equals("alex") && userInputPassword.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        } else if (userInputName.equals("emily") && userInputPassword.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
