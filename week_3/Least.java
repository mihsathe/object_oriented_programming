public class Least {
    
    public static int least (int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
    
    public static void main (String[] args) {
        int leastNumber = least (2, 7);
        System.out.println("Least: " + leastNumber);
    }
}