import java.util.Arrays;

public class CopyAndReverse {
    
    public static void main(String[] args) {
        int[] originalArray = {1, 4, 10};
        int[] copiedArray = copy(originalArray);
        
        copiedArray[0] = 99;
        
        System.out.println("original: " + Arrays.toString(originalArray));
        System.out.println("copied: " + Arrays.toString(copiedArray));
        
        int[] reverseArray = reverseCopy(originalArray);
        
        System.out.println("\noriginal: " + Arrays.toString(originalArray));
        System.out.println("copied: " + Arrays.toString(reverseArray));
        
    }
    
    public static int[] copy(int[] arrayFromUser) {
        int[] copyArray = new int[arrayFromUser.length];
        
        for (int count = 0; count < arrayFromUser.length; count++) {
            copyArray[count] = arrayFromUser[count];
        }
        
        return copyArray;
    }
    
    public static int[] reverseCopy(int[] originalArray) {
        int[] arrayReverse = new int[originalArray.length];
        int arrayLength = originalArray.length - 1;
        
        for (int count = 0; count < originalArray.length; count++) {
            arrayReverse[count] = originalArray[arrayLength];
            arrayLength--;
        }
        
        return arrayReverse;
    }
}