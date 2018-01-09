import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        int temp = 1;
        
        while (true) {
            System.out.print("Type a number:");
            int userInputNumber = Integer.parseInt(userInput.nextLine());
            sum += userInputNumber;
            if (temp == 3) {
                break;
            } else {
                temp++;
            }
        }
        
        System.out.println("Sum is " + sum);
    }
}
