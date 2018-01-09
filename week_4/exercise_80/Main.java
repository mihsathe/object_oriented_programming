public class Main {
    
    public static void main(String[] args) {
        Dice testDice = new Dice(8);
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println(testDice.roll());
            counter++;
        }
    }
}