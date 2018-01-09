import java.util.Scanner;

public class SeparatingCharacters {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type your name: ");
        String userInputName = scannerReader.nextLine();
        int count= 0;
        
        while (count < userInputName.length()) {
            System.out.println((count + 1) + ". Character: " + userInputName.charAt(count));
            count++;
        }
    }
}