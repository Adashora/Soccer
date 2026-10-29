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

        System.out.println("==================================");
        System.out.println("      UNDERDOG FC MANAGER");
        System.out.println("==================================");
        System.out.println("Board Goal: Earn 20 points in 12 matches.");
        System.out.println();

        while (season.getMatchNumber() <= 12)
        {
            playWeek(team, season);
        }

        endSeason(team, season);
    }

    public static void playWeek(Team team, Season season)
    {
        System.out.println();
        System.out.println("========== WEEK " + season.getMatchNumber() + " ==========");
        System.out.println("Fitness: " + team.getFitness());
        System.out.println("Morale: " + team.getMorale());
        System.out.println("Tactics: " + team.getTactics());
        System.out.println("League Points: " + team.getPoints());
        System.out.println();

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

        playMatch(team, season, opponent, opponentStrength);

        

        season.nextMatch();
    }
    public static void playMatch(Team team, Season season, String opponent, int opponentStrength){

        System.out.println("========== MATCHDAY ==========");
        System.out.println("Underdog FC vs " + opponent);

        int yourGoals = 0;
        int opponentGoals = 0;

        //first half events
        System.out.println("Game Start!!!");

        for (int i = 0; i < 45; i++){

            int chance = randomInt(6);
            if (randomInt(90) < 5){

                if (chance == 1){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(i + "':");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("GOALLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }

                if (chance == 2){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(i + "':");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(i + "':");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("Yellow Card for " + opponent);
                }
                if (chance == 4){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(i + "':");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("Yellow Card for Underdog FC");
                }
                if (chance == 5){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(i + "':");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("Big chance for " + opponent);

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("No goal.");
                    
                }
                if (chance == 6){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(i + "':");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("Big chance for Underdog FC");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("No goal.");
                    
                }
                
            }


            
        }
        for (int i = 45; i < 90; i++){

            int chance = randomInt(6);
            if (randomInt(90) < 5){

                if (chance == 1){
                    System.out.println(i + "':");

                    System.out.println("GOALLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }
                if (chance == 2){
                    System.out.println(i + "':");

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3){
                    System.out.println(i + "':");

                    System.out.println("Yellow Card for " + opponent);
                }
                if (chance == 4){
                    System.out.println(i + "':");

                    System.out.println("Yellow Card for Underdog FC");
                }
                if (chance == 5){
                    System.out.println(i + "':");

                    System.out.println("Big chance for " + opponent);

                    System.out.println("No goal.");
                    
                }
                if (chance == 6){
                    System.out.println(i + "':");

                    System.out.println("Big chance for Underdog FC");

                    System.out.println("No goal.");
                    
                }
                
            }


            
        }

       


        System.out.println();
        System.out.println("========== FULL TIME ==========");
        System.out.println("Underdog FC " + yourGoals + " - " + opponentGoals + " " + opponent);

       
       
        if (yourGoals > opponentGoals)
        {
            team.addPoints(3);
            season.addWin();
            //System.out.println("Underdog FC " + yourGoals + " - " + opponentGoals + " " + opponent);
            System.out.println("Victory!");
        }
        else if (yourGoals == opponentGoals)
        {
            team.addPoints(1);
            season.addDraw();
            //System.out.println("Underdog FC " + yourGoals + " - " + opponentGoals + " " + opponent);
            System.out.println("Draw.");
        }
        else
        {
            season.addLoss();
            //System.out.println("Underdog FC " + yourGoals + " - " + opponentGoals + " " + opponent);
            System.out.println("Defeat.");
        }

    }

    public static void endSeason(Team team, Season season)
    {
        System.out.println("\n========== SEASON COMPLETE ==========");
        System.out.println("Wins: " + season.getWins());
        System.out.println("Draws: " + season.getDraws());
        System.out.println("Losses: " + season.getLosses());
        System.out.println("Points: " + team.getPoints());

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

    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }

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
}
