import java.util.Scanner;

public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        int sum = 0;
        
        while (true) {
            System.out.println("Type a number");
            int userInputNumber = Integer.parseInt(scannerReader.nextLine());
            
            if (userInputNumber == 0) {
                break;
            }
            sum += userInputNumber;
            System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}
