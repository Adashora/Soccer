import java.util.Scanner;
import java.util.Arrays;;


public class Main
{

    /* TO-DO LIST NOVEMBER 6TH
        -- Minor Goals --
        - formate league table better
        - make schedule random


        1: complete goals and goal difference
        - add to table (DONE)
        - make goal difference the tiebreaker
        3: make wins and losses affect morale
        - look over how morale affects strength
        - does strength still affect users games?
        --
        4: fix QOL
        - typos 
        - same time pauses
        - pauses after texts
        - make it look smooth

        --FUTURE GOALS--
        1: rivalries?
        2: Choose team name
        2: add players next?
        - transfers
        - rosters
        - Halftime subs
        - Overalls
        4: Create whole main me nu to choose game mode
        - tounrmanet mode
            - champions league
            - international
        - season mode
            - different nations
            - different amoutn of teams (20, 12, 6 idk)
        -
    
    
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
