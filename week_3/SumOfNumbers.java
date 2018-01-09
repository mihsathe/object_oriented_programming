import java.util.ArrayList;

public class SumOfNumbers {
    
    public static int sum(ArrayList<Integer> userIntegers) {
        int sum = 0;
        
        for (int number: userIntegers) {
            sum += number;
        }
        return sum;
    }
    
    public static void main(final String[] args) {
        ArrayList<Integer> arrayListOfIntegers = new ArrayList<Integer>();
        arrayListOfIntegers.add(3);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(7);
        arrayListOfIntegers.add(2);
        
        System.out.println("The sum: " + sum(arrayListOfIntegers));
        
        arrayListOfIntegers.add(10);
        
        System.out.println("The sum: " + sum(arrayListOfIntegers));
    }
}