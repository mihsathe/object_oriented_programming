import java.util.Scanner;

public class ReversingName {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type your name: ");
        String userInputName = scannerReader.nextLine();
        int count = 1;
        
        while (count <= userInputName.length()) {
            System.out.print(userInputName.charAt(userInputName.length() - count));
            count++;
        }
        
        System.out.print("\n");
    }
}