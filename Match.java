import java.util.Scanner;

public class Match {


    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }


    private static Scanner key = new Scanner(System.in);


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

            System.out.println("");
            System.out.println("It is halftime the score is: " + yourGoals + "-" + opponentGoals);
            System.out.println("What adjustments would you like to make: \n 1: More attacking \n 2: Stay balanced \n 3: defend the goal");

            int choice = key.nextInt();

        for (int i = 45; i < 90; i++){
            if (choice == 1){
                 int chance = randomInt(8);
            if (randomInt(90) < 5){

                if (chance == 1 || chance == 7){
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
                if (chance == 2 || chance == 8){

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

            if (choice == 2){
                 int chance = randomInt(6);
            if (randomInt(90) < 5){

                if (chance == 1){
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
            
            if (choice == 3){
                 int chance = randomInt(8);
            if (randomInt(90) < 5){

                if (chance == 1){
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
                if (chance == 3 || chance == 7){

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
                if (chance == 5 || chance == 8){

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(i + "':");

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
                
            else{
            int chance = randomInt(6);
            if (randomInt(90) < 5){

                if (chance == 1){
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
    
    
}
