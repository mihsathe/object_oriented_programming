import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        System.out.print("Type a number ");
        int userInputTwoPower = Integer.parseInt(scannerReader.nextLine());
        int initialNumber = 0;
        int sum = 0;
        
        while (initialNumber <= userInputTwoPower) {
            sum += (int)Math.pow(2, initialNumber);
            initialNumber++;
        }
        System.out.println("The power is " + sum);
    }
}
