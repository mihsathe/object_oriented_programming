public class Printing {
    
    public static void main(String[] args) {
        
        printTriangle (4);
        System.out.println("\n");
        
        printRectangle (17, 3);
        System.out.println("\n");
        
        printSquare (4);
        System.out.println("\n");
        
        printStars (5);
        System.out.println("\n");
        printStars (3);
        System.out.println("\n");
        printStars (9);
        System.out.println("\n");
        
    }
    
    public static void printStars (int stars) {
        int count = 1;
        
        while (count <= stars) {
            System.out.print("*");
            count++;
        }
        System.out.print("\n");
    }
    
    public static void printSquare (int squareSize) {
        int count = 1;
        
        while (count <= squareSize) {
            printStars (squareSize);
            count++;
        }
    }
    
    public static void printRectangle (int width, int height) {
        int count = 1;
        
        while (count <= height) {
            printStars (width);
            count++;
        }
    }
    
    public static void printTriangle (int triangleSize) {
        int count = 1;
        
        while (count <= triangleSize) {
            printStars (count);
            count++;
        }
    }
}