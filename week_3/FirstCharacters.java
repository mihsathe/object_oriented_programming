import java.util.Scanner;

public class FirstCharacters {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print ("Type your name: ");
        String userInputName = scannerReader.nextLine();
        
        if (userInputName.length() > 3) {
            System.out.println("1. character: " + userInputName.charAt(0));
            System.out.println("2. character: " + userInputName.charAt(1));
            System.out.println("3. character: " + userInputName.charAt(2));
        }
        
        
    }
}