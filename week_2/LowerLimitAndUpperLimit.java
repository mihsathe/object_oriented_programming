import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner scannerReader = new Scanner (System.in);
        System.out.print("First: ");
        int lowerLimit = Integer.parseInt(scannerReader.nextLine());
        System.out.print("Last: ");
        int upperLimit = Integer.parseInt(scannerReader.nextLine());
        
        while (lowerLimit <= upperLimit) {
            System.out.println(lowerLimit);
            lowerLimit++;
        }
    }
}
