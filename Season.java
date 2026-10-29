import java.util.Scanner;

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

    public static String getOpponentName(int num)
    {
        if (num == 0) return "Riverside FC";
        else if (num == 1) return "Northport Athletic";
        else if (num == 2) return "Steel City United";
        else if (num == 3) return "Valley Rovers";
        else if (num == 4) return "Harbor Town FC";
        else if (num == 5) return "Metro Stars";
        else if (num == 6) return "Red Oak FC";
        else if (num == 7) return "Blue River SC";
        else if (num == 8) return "Summit United";
        return "Lakeside Wanderers";
    }


    public static void playWeek(Team team, Season season)
    {
        Text.Weeks(team, season);

        System.out.println("1. Intense Training");
        System.out.println("2. Tactical Study");
        System.out.println("3. Team Bonding");
        System.out.println("4. Recovery Week");
        System.out.print("Choice: ");

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

        String opponent = getOpponentName(randomInt(10));
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
