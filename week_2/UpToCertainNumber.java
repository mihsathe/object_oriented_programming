import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("Up to what number? ");
        int userInputNumber = Integer.parseInt(scannerReader.nextLine());
        int initialNumber = 1;
        
        while (initialNumber <= userInputNumber) {
            System.out.println(initialNumber);
            initialNumber++;
        }
    }
}
