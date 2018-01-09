import java.util.ArrayList;

public class AverageOfNumbers {
    
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int number: list) {
            sum += number;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        System.out.println(sum);
        System.out.println(list.size());
        double average = (double) sum / list.size();
        return average;
    }
    
    public static void main(final String[] args) {
        ArrayList<Integer> userArrayListOfIntegers = new ArrayList<Integer>();
        userArrayListOfIntegers.add(3);
        userArrayListOfIntegers.add(2);
        userArrayListOfIntegers.add(7);
        userArrayListOfIntegers.add(2);

        System.out.println("The average is: " + average(userArrayListOfIntegers));
    }
}