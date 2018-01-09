public class AverageOfGivenNumbers {
    
    public static int sum (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        return sum;
    }
    
    public static double average (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        double sum = (double) sum (firstNumber, secondNumber, thirdNumber, fourthNumber);
        return (sum / 4);
    }
    
    public static void main (String[] args) {
        double averageOfTheNumbers = average (4, 3, 6, 1);
    System.out.println("average: " + averageOfTheNumbers);
    }
}