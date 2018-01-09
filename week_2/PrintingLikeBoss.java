public class PrintingLikeBoss {
    
    public static void printWhitespaces (int size) {
        int count = 1;
        
        while (count <= size) {
            System.out.print(" ");
            count++;
        }   
    }
    
    public static void printStars (int starSize) {
        int count = 1;
        
        while (count <= starSize) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }
    
    public static void printTriangle (int triangleSize) {
        int count = 1;
        int whiteSpaceLength;
        
        while (count <= triangleSize) {
            whiteSpaceLength = triangleSize - count;
            printWhitespaces (whiteSpaceLength);
            printStars (count);
            count++;
        }
    }
    
    public static void xmasTree (int height) {
        int count = 1;
        int whiteSpaceLength;
        int xmasTreeHeight = 1;
        
        while (count <= height) {
            whiteSpaceLength = height - count;
            printWhitespaces (whiteSpaceLength);
            printStars (xmasTreeHeight);
            count++;
            xmasTreeHeight += 2;
        }
        
        int xmasTreeStandHeight = 1;
        int xmasTreeStandWide = 3;
        
        while (xmasTreeStandHeight < xmasTreeStandWide) {
            printWhitespaces (height - 2);
            printStars (xmasTreeStandWide);
            xmasTreeStandHeight++;
        }   
    }
    
    public static void main (String[] args) {
        printTriangle (4);
        
        xmasTree (4);
    }
}