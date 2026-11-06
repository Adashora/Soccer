import java.util.Scanner;
import java.util.Arrays;;


public class Main
{

    /* TO-DO LIST NOVEMBER 6TH
        1: complete goals and goal difference
        2: add to table
        3: make goal difference the tiebreaker
        --
        4: fix QOL -- typos same time pauses, pauses after texts, make it smooth
        5: brainstorm -- add players next?
    
    
    */ 

    










    private static Scanner keyboard = new Scanner(System.in);

    

    public static void main(String[] args)
    {
        Team team = new Team();
        Season season = new Season();
        League league = new League();

        

        
        
        Text.intro(); 
        
        

        while (season.getMatchNumber() <= 12) //while season isnt over
        {
            
            league.simWeek(); //sim ai games and generate users opponent
            Season.playWeek(team, season, league); //plays users game
            league.printTable(); //prints the table after week
        }

        Season.endSeason(team); //ends season
    }

    
   

    

    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }

    



}
