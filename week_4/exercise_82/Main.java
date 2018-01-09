import java.util.ArrayList;
        
public class Main {
    
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> list = lotteryNumbers.numbers();
        
        System.out.println("Lottery Numbers: ");
        
        for (int number: list) {
            System.out.print(number + " ");
        }
        
        System.out.println("");
    }
}