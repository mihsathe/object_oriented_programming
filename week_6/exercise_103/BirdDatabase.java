import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
    
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(Scanner userInput) {
        System.out.print("Name: ");
        String name = userInput.nextLine();
        System.out.print("Latin Name: ");
        String latinName = userInput.nextLine();
        
        Bird newBird = new Bird(name, latinName);
        
        this.birds.add(newBird);
    }
    
    public boolean observation(Scanner userInput) {
        System.out.print("What was observed:?");
        String name = userInput.nextLine();
        
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                bird.observed();
                return true;
            }
        }
        
        return false;
    }
    
    public void statistics() {
        for (Bird bird : this.birds) {
            System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObserved() + " observations");
        }
    }
    
    public void show(Scanner userInput) {
        System.out.print("What?");
        String name = userInput.nextLine();
        
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObserved() + " observations");
            }
        }
    }
}