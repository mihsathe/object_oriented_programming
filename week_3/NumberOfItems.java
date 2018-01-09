import java.util.ArrayList;

public class NumberOfItems {
    
    public static int countItems(ArrayList<String> userInputArrayList) {
        return userInputArrayList.size();
    }
    
    public static void main(final String[] args) {
        ArrayList<String> list = new ArrayList<String>();
               
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
    }
}