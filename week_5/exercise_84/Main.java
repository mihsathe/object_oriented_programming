public class Main {
    
    public static void main(String[] args) {
        Counter testCount = new Counter(900, false);
        
        
        System.out.println(testCount.value());
        
        testCount.decrease(-55);
        System.out.println(testCount.value());
        
        testCount.decrease();
        System.out.println(testCount.value());
        
        testCount.decrease();
        System.out.println(testCount.value());
        //System.out.println(testCount.increase());
        
        
    }
}