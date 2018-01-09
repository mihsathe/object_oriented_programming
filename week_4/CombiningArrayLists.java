import java.util.ArrayList;

public class CombiningArrayLists {
    
    public static void combine(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        firstList.addAll(secondList);
    }
    
    public static void main(final String[] args) {
        ArrayList<Integer> firstList = new ArrayList<Integer>();
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        
        firstList.add(4);
        firstList.add(3);
        
        secondList.add(5);
        secondList.add(10);
        secondList.add(7);
        
        combine(firstList, secondList);
        
        System.out.println(firstList);
        System.out.println(secondList);
    }
}