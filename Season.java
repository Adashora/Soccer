import java.util.Scanner;
import java.util.ArrayList;

public class Season
{
    private int matchNumber;
    private int wins;
    private int draws;
    private int losses;
    private Matchup currentUserMatchup;
    private static League league;
    

        private static Scanner keyboard = new Scanner(System.in);

    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }
    public void setCurrentUserMatchup(Matchup game){ 
        currentUserMatchup = game;

    }

    public Matchup getCurrentUserMatchup(){
        return currentUserMatchup;
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
        ArrayList<String> opponents = new ArrayList<String>(); //array of every team except user
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

            int index = randomInt(opponents.size()); //picks a random opponent
            String opponent = opponents.get(index);
            opponents.remove(index); //removes opponent from list
            return opponent;
    }


    public static void playWeek(Team team, Season season, League league) 
    {
        Text.Weeks(team, season);

        System.out.println("1. Intense Training"); //prints weekly choices
        System.out.println("2. Tactical Study");
        System.out.println("3. Team Bonding");
        System.out.println("4. Recovery Week");
        System.out.print("Choice: ");

        int choice = keyboard.nextInt();

        if (choice == 1)
        {
            team.changeFitness(10);
            team.changeMorale(-6);
        }
        else if (choice == 2)
        {
            team.changeTactics(10);
            team.changeFitness(-4);
        }                                       //choices affect the teams attributes -- add wins and losses effect on morale
        else if (choice == 3)
        {
            team.changeMorale(10);
            team.changeFitness(-6);
            team.changeTactics(-4);
        }
        else
        {
            team.changeFitness(8);
            team.changeMorale(4);
            team.changeTactics(-3);
        }

        
        Matchup game = league.getCurrentUserMatch(); //defines the users game

        leagueTeam opponent;

        if(game.getTeam1().getName().equals("Underdog FC")){     // finds out if user is team 1 or team 2
            opponent = game.getTeam2();
        }
        else{
            opponent = game.getTeam1();
        }
        int opponentStrength = league.getStrength();    //gets the opponents strength

        Match.playMatch(team, season, opponent, opponentStrength); //plays match
        

        

        season.nextMatch(); //moves to next match;
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
