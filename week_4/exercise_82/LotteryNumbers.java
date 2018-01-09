import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    
    private ArrayList<Integer> lotteryNumbers;
    private Random random = new Random();
    
    public LotteryNumbers() {
        this.drawNumbers();
    }
    
    public ArrayList<Integer> numbers() {
        return this.lotteryNumbers;
    }
    
    public void drawNumbers() {
        this.lotteryNumbers = new ArrayList<Integer>();
        int count = 0;
        int randomNumber;
        
        while (count < 7) {
            randomNumber = random.nextInt(39) + 1;
            
            if (!containsNumber(randomNumber)) {
                this.lotteryNumbers.add(randomNumber);
                count++;
            }
        }
    }
    
    public boolean containsNumber(int number) {
        return this.lotteryNumbers.contains(number);
    }
    
    
}