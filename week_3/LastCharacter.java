import java.util.Scanner;

public class LastCharacter {
    
    public static char lastCharacter (String userName) {
        return userName.charAt(userName.length() - 1);
    }
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type your name: ");
        String userInputName = scannerReader.nextLine();
        System.out.println("Last character: " + lastCharacter (userInputName));
    }
}