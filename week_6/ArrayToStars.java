public class ArrayToStars {
    
    public static void main(String[] args) {
        int[] arrayForTesting = {5, 1, 3, 4, 2};
        printArrayAsStars(arrayForTesting);
    }
    
    public static void printArrayAsStars(int[] arrayFromUser) {
        for (int row = 0; row < arrayFromUser.length; row++) {
            
            for (int column = 0; column < arrayFromUser[row]; column++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}