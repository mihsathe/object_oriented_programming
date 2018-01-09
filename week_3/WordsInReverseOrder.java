import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String userInput = scannerReader.nextLine();
            
            if (userInput.isEmpty()) {
                break; 
            } else {
                words.add(userInput);
            }
        }
        
        Collections.reverse(words);
        
        for (String word: words) {
            System.out.println(word);
        }
    }
}