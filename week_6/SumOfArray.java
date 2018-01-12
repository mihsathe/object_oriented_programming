public class SumOfArray{
    
    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};
        
        System.out.println(sum(arrayTest));
    }
    
    public static int sum(int[] arrayFromUser) {
        int sum = 0;
        
        for (int count = 0; count < arrayFromUser.length; count++) {
            sum += arrayFromUser[count];
        }
        
        return sum;
    }
}