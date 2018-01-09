import java.util.Scanner;

public class ManyPrints {
    
    public static void main(String[] args) {
        Scanner scannerReader = new Scanner(System.in);
        System.out.println("How many?");
        int userInputCount = Integer.parseInt(scannerReader.nextLine());
        int initialValue = 0;
        
        while (initialValue < userInputCount) {
            printText();
            initialValue++;
        }
    }
    
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}