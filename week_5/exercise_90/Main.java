public class Main {
    
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        barcelona.setMaxSize(1);
        
        Player playerA = new Player("Brian");
        //System.out.println("Player: " + playerA);
        
        Player playerB = new Player("Pekka", 39);
        //System.out.println("Player: " + playerB);
        
        //barcelona.addPlayer(playerA);
        barcelona.addPlayer(playerB);
        barcelona.addPlayer(new Player("Mikael", 1));
        
        System.out.println("Number of players: " + barcelona.size());
        
        System.out.println("Total goals: " + barcelona.goals());
    }
}