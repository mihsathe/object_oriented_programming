import java.util.Scanner;

public class LengthOfName {
    
    public static int calculateCharacters (String userName) {
        return userName.length();
    }
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in); 
        System.out.print ("Type your name: ");
        String userInputName = scannerReader.nextLine();
        System.out.println ("Numbers of characters: " + calculateCharacters (userInputName));
    }
}