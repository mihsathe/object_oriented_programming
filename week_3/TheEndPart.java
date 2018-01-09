import java.util.Scanner;

public class TheEndPart {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print ("Type a word: ");
        String userInputName = scannerReader.nextLine();
        int userInputNameLength = userInputName.length();
        
        System.out.print ("Length of the end part: ");
        int lengthOfTheEndPartString = Integer.parseInt(scannerReader.nextLine());
        
        System.out.println("Result: " + userInputName.substring(userInputNameLength - lengthOfTheEndPartString, userInputNameLength));
    }
}