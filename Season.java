import java.util.Scanner;
import java.util.ArrayList;

public class Season
{
    private int matchNumber;
    private int wins;
    private int draws;
    private int losses;
        private static Scanner keyboard = new Scanner(System.in);

    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }


    public Season()
    {
        matchNumber = 1;
        wins = 0;
        draws = 0;
        losses = 0;
    }

    public int getMatchNumber(){ return matchNumber; }
    public int getWins(){ return wins; }
    public int getDraws(){ return draws; }
    public int getLosses(){ return losses; }

    public void nextMatch(){ matchNumber++; }
    public void addWin(){ wins++; }
    public void addDraw(){ draws++; }
    public void addLoss(){ losses++; }

    

    public static String getOpponentName()
    {
        ArrayList<String> opponents = new ArrayList<String>();
            opponents.add("Madison FC");
            opponents.add("Arsenal");
            opponents.add("Man City");
            opponents.add("Barcelona");
            opponents.add("Real Madrid");
            opponents.add("Bayern Munich");
            opponents.add("Dortmund");
            opponents.add("Inter Milan");
            opponents.add("Juventus");
            opponents.add("PSG");
            opponents.add("Monaco");
            opponents.add("Liverpool");

            int index = randomInt(opponents.size());
            String opponent = opponents.get(index);
            opponents.remove(index);
            return opponent;
    }


    public static void playWeek(Team team, Season season)
    {
        Text.Weeks(team, season);

        System.out.println("\t\t1. Intense Training");
        System.out.println("\t\t2. Tactical Study");
        System.out.println("\t\t3. Team Bonding");
        System.out.println("\t\t4. Recovery Week");
        System.out.print("\t\tChoice: ");

        int choice = keyboard.nextInt();

        if (choice == 1)
        {
            team.changeFitness(6);
            team.changeMorale(-6);
        }
        else if (choice == 2)
        {
            team.changeTactics(10);
            team.changeFitness(-4);
        }
        else if (choice == 3)
        {
            team.changeMorale(10);
            team.changeFitness(-4);
            team.changeTactics(-4);
        }
        else
        {
            team.changeFitness(8);
            team.changeMorale(4);
        }

        
        String opponent = getOpponentName();
        int opponentStrength = 55 + randomInt(41);
        int teamStrength = (team.getFitness() + team.getMorale() + team.getTactics()) / 3;

        

        System.out.println();
        System.out.println("Opponent: " + opponent);

        Match.playMatch(team, season, opponent, opponentStrength);

        

        season.nextMatch();
    }



    public static void endSeason(Team team)
    {
        Text.end();

        if (team.getPoints() >= 20)
        {
            System.out.println("The board is impressed!");
            System.out.println("Your contract has been renewed.");
        }
        else
        {
            System.out.println("The board expected more.");
            System.out.println("You have been fired.");
        }
    }
}
