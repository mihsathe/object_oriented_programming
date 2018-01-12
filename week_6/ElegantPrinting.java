public class ElegantPrinting {
    
    public static void main(String[] args) {
        int[] arrayForTesting = {1, 5, 8, 9, 10};
        
        printElegantly(arrayForTesting);
    }
    
    public static void printElegantly(int[] arrayFromUser) {
        for (int count = 0; count < arrayFromUser.length; count++) {
            
            if (count != arrayFromUser.length - 1) {
                System.out.print(arrayFromUser[count] + ", ");
            } else {
                System.out.print(arrayFromUser[count]);
            }
        }
    }
}