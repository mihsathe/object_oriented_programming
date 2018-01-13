public class Main {

    public static void main(String[] args) {
        Money testA = new Money(10, 0);
        Money testB = new Money(3, 50);
        
        Money testC = testA.minus(testB);
        
        System.out.println(testA);
        System.out.println(testB);
        System.out.println(testC);
        
        testC = testC.minus(testA);
        
        System.out.println(testA);
        System.out.println(testB);
        System.out.println(testC);
    }
}
