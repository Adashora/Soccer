import java.util.Scanner;

/**
 * Runs the soccer manager game.
 *
 * @author Abhinav
 */
public class Main
{
    private static Scanner keyboard = new Scanner(System.in);

    

    public static void main(String[] args)
    {
        Team team = new Team();
        Season season = new Season();

        Text.intro();

        while (season.getMatchNumber() <= 12)
        {
            Season.playWeek(team, season);
        }

        Season.endSeason(team);
    }

    
   

    

    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }

    



}
