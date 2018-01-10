import java.util.ArrayList;

public class Team {
    
    private String teamName;
    private int maxTeamSize;
    private ArrayList<Player> players;
    
    public Team(String name) {
        this.teamName = name;
        this.maxTeamSize = 16;
        this.players = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.teamName;
    }
    
    public void addPlayer(Player playerName) {
        if (this.players.size() < this.maxTeamSize) {
            Player newPlayer = new Player(playerName.getName(), playerName.goals());
            players.add(newPlayer);
        }
    }
    
    public void printPlayers() {
        for (Player player: players) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxTeamSize = maxSize;
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int numberOfGoals = 0;
        
        for (Player player: players) {
            numberOfGoals += player.goals();
        }
        
        return numberOfGoals;
    }
}