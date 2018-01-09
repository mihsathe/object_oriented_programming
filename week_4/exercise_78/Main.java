import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner userReader = new Scanner(System.in);
        
        BoundedCounter secondsCounter = new BoundedCounter(59);
        BoundedCounter minutesCounter = new BoundedCounter(59);
        BoundedCounter hoursCounter = new BoundedCounter(23);
        
        System.out.println("seconds: ");
        int userInputSeconds = Integer.parseInt(userReader.nextLine());
        System.out.println("minutes: ");
        int userInputMinutes = Integer.parseInt(userReader.nextLine());
        System.out.println("hours: ");
        int userInputHours = Integer.parseInt(userReader.nextLine());
        
        secondsCounter.setValue(userInputSeconds);
        minutesCounter.setValue(userInputMinutes);
        hoursCounter.setValue(userInputHours);
        
        int i = 0;
        
        while (i < 121) {            
            System.out.println(hoursCounter + ":" + minutesCounter + ":" + secondsCounter);
            
            secondsCounter.next();
            
            if (secondsCounter.getValue() == 0) {
                minutesCounter.next();
            }
            
            if (secondsCounter.getValue() == 0 && minutesCounter.getValue() == 0) {
                hoursCounter.next();
            }
            
            i++;
        }
        
    }
}