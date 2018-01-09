import java.util.Scanner;

public class FirstPart {
    
    public static void main (String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Type a word: ");
        String userInputName = scannerReader.nextLine();
        System.out.print("Length of the first part: ");
        int howManyLengthToDisplay = Integer.parseInt(scannerReader.nextLine());
        System.out.println("Result: " + userInputName.substring(0, howManyLengthToDisplay));
    }
}