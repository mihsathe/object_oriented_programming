import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BirdDatabase testBirdDatabase = new BirdDatabase();
        String option;
        
        while (true) {
            System.out.print("? ");
            option = userInput.nextLine();
            
            if (option.equals("Add")) {
                testBirdDatabase.addBird(userInput);
            } else if (option.equals("Observation")) {
                if (!(testBirdDatabase.observation(userInput))) {
                    System.out.println("Is not a bird!");
                }
            } else if (option.equals("Statistics")) {
                testBirdDatabase.statistics();
            } else if (option.equals("Show")) {
                testBirdDatabase.show(userInput);
            } else if (option.equals("Quit")) {
                break;
            }
        }
    }
}