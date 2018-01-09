import java.util.ArrayList;

public class LengthsOfStrings {
    
    public static ArrayList<Integer> lengths(ArrayList<String> userInput) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        
        for (String element: userInput) {
            lengths.add(element.length());
        }
        return lengths;
    }
    
    public static void main(final String[] args) {
        ArrayList<String> userInputStrings = new ArrayList<String>();
        userInputStrings.add("Hallo");
        userInputStrings.add("Moi");
        userInputStrings.add("Benvenuto!");
        userInputStrings.add("badger badger badger badger");
        
        ArrayList<Integer> lengths = lengths(userInputStrings);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}