import java.util.Scanner;

public class Palindromi {
    
    public static boolean palindrome(String userInputString) {
        int indexStartPosition = 0; 
        int indexEndPosition = userInputString.length() - 1; 
        char startCharPosition;
        char endCharPosition;
            
        while (indexStartPosition <= indexEndPosition) {
            startCharPosition = userInputString.charAt(indexStartPosition);
            endCharPosition = userInputString.charAt(indexEndPosition);
            
            if (startCharPosition == endCharPosition) {
                indexStartPosition++;
                indexEndPosition--;
            } else {
                return false;
            }
        }
        return true;
    }
    
    public static void main(final String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        
        System.out.println("Type a text:"); 
        String userInputString = scannerReader.nextLine();
        
        if (palindrome(userInputString)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}