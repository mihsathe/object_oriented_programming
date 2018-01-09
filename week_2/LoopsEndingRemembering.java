import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        int userInputNumber;
        int sum = 0;
        int count = 0;
        int evenCounter = 0;
        System.out.println("Type numbers: ");
        
        while (true) {
            userInputNumber = Integer.parseInt(scannerReader.nextLine());
            if (userInputNumber == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else if (userInputNumber % 2 == 0) {
                evenCounter++;
            }
            
            sum += userInputNumber;
            count++;
        }
        
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (sum / (1.0 * count)));
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + (count - evenCounter));
    }
}
