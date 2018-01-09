import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        NumberStatistics list = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();
        
        
        System.out.println("Type numbers:");
        int userInputNumber = Integer.parseInt(userInput.nextLine());
        
        while (userInputNumber != -1) {
            if (userInputNumber % 2 == 0) {
                evenNumbers.addNumber(userInputNumber);
            } else {
                oddNumbers.addNumber(userInputNumber);
            }
            
            list.addNumber(userInputNumber);
            userInputNumber = Integer.parseInt(userInput.nextLine());
        }
                
        System.out.println("Sum: " + list.sum());
        System.out.println("Sum of all even: " + evenNumbers.sum());
        System.out.println("Sum of all odd: " + oddNumbers.sum());
    }
}