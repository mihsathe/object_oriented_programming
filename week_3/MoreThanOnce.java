import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {
    
    public static boolean moreThanOnce(ArrayList<Integer> userInputNumbers, int number) {
        int count = 0;
        
        for (int element: userInputNumbers) {
            if (number == element) {
                count++;
            }
        }
        
        if (count > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(final String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        
        ArrayList<Integer> userInputIntegers = new ArrayList<Integer>();
        userInputIntegers.add(3);
        userInputIntegers.add(2);
        userInputIntegers.add(7);
        userInputIntegers.add(2);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(scannerReader.nextLine());
        
        if (moreThanOnce(userInputIntegers, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}