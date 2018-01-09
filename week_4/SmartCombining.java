import java.util.ArrayList;

public class SmartCombining {
    
    public static void smartCombine(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        for (int element : secondList) {
            if (!firstList.contains(element)) {
                firstList.add(element);
            }
        }
    }
    
    public static void main(final String[] args) {
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        
        firstList.add(4);
        firstList.add(5);
        
        secondList.add(5);
        secondList.add(10);
        secondList.add(20);
        
        smartCombine(firstList, secondList);
        
        System.out.println(firstList);
        System.out.println(secondList);
    }    
}