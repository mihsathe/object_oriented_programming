import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.print("Until what? ");
        int userInputNumber = Integer.parseInt(userInput.nextLine());
        int initialNumber = 1;
        int sum = 0;
        
        while (initialNumber <= userInputNumber) {
            sum += initialNumber;
            initialNumber++;
        }
        System.out.println("Sum is " + sum);
    }
}