public class Greatest {
    
    public static int greatest (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber) {
            if (secondNumber < thirdNumber) {
                return thirdNumber;
            } else {
                return secondNumber;
            }
        } else {
            if (firstNumber < thirdNumber) {
                return thirdNumber;
            } else {
                return firstNumber;
            }
        }
    }
    
    public static void main (String[] args) {
        int greatestNumber = greatest (3, 9, 8);
        System.out.println("Greatest: " + greatestNumber);
    }
}