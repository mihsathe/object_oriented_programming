import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerLimit = Integer.parseInt(scannerReader.nextLine());
        System.out.print("Last: ");
        int upperLimit = Integer.parseInt(scannerReader.nextLine());
        int sum = 0;
        
        while (lowerLimit <= upperLimit) {
            sum += lowerLimit;
            lowerLimit++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
