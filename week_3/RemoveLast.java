import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    
    public static String removeLast(ArrayList<String> list) {
        return list.remove(list.size() - 1);
    }
    
    public static void main(final String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);
        
        Collections.sort(brothers);
        
        removeLast(brothers);
        
        System.out.println(brothers);
    }
}
