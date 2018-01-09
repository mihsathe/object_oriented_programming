public class Main {
    
    public static void main(String[] args) {
        Menu testMenu = new Menu();
        
        testMenu.addMeal("Hamburger");
        testMenu.addMeal("Fish'n'Chips");
        testMenu.addMeal("Sauerkraut");
        
        testMenu.printMeals();
        
        testMenu.clearMenu();
        testMenu.printMeals();
    }
}