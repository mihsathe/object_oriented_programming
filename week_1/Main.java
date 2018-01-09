import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        
        //top 10 players based on goals
        System.out.println("Top 10 players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //top 25 players based on penalty amounts
        System.out.println("\nTop 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //statistics for Sidney Crosby
        System.out.println("\nStatistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //statistics for Philadelphia Flyers
        System.out.println("\nStatistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        //players in Anaheim Ducks
        System.out.println("\nPlayer in Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
