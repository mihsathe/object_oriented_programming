import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String userInputString = scannerReader.nextLine();
            
            if (userInputString.isEmpty()) {
                break;
            } else {
                words.add(userInputString);
            }
        }
        
        Collections.sort(words);
        
        for (String word: words) {
            System.out.println(word);
        }
    }
}