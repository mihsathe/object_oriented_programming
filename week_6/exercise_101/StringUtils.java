public class StringUtils {
    
    public static boolean included(String word, String searched) {
        searched = searched.trim(); 
        searched = searched.toUpperCase();
        word = word.toUpperCase();
        
        return word.contains(searched);
    }
}