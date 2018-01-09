import java.util.Scanner;

public class WordInsideWord {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type the first word: ");
        String userInputFirstWord = scannerReader.nextLine();
        System.out.print("Type the second word: ");
        String userInputSecondWord = scannerReader.nextLine();
        
        int wordFound = userInputFirstWord.indexOf(userInputSecondWord);
        
        if (wordFound >= 0 ) {
            System.out.println("The word '" + userInputSecondWord + "' is found in the word '" + userInputFirstWord + "'.");
        } else {
            System.out.println("The word '" + userInputSecondWord + "' is not found in the word '" + userInputFirstWord + "'.");
        }
    }
}