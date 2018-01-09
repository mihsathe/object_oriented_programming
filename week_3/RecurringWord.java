import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String userInputString = scannerReader.nextLine();
            
            if (words.contains(userInputString)) {
                System.out.println("You gave the word " + userInputString +" twice");
                break;
            } else {
                words.add(userInputString);
            }
        }
    }
}