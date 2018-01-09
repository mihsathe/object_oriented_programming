import java.util.Scanner;

public class FirstCharacter {
    
    public static char firstCharacter (String userName) {
        return userName.charAt(0);
    }
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type your name: ");
        String userInputName = scannerReader.nextLine();
        System.out.println("First Character: " + firstCharacter (userInputName));
    }
}