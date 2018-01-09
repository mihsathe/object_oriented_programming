import java.util.Scanner;

public class ReversingText {
    
    public static String reverse (String userName) {
        int stringLengthCount = userName.length() - 1 ;
        
        String reverseUserName = "";
        
        while (stringLengthCount >= 0) {
            reverseUserName += userName.charAt(stringLengthCount);
            stringLengthCount--;
        }
        return reverseUserName;
    }
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type in your text: ");
        String userInputName = scannerReader.nextLine();
        System.out.println("In reverse order: " + reverse (userInputName));
    }
}