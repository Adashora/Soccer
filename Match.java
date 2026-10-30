import java.util.Scanner;

public class Match {

    public static void pause(int a){


        try
        {
            Thread.sleep(a);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    public static int randomInt(int max)
    {
        return (int)(Math.random() * max);
    }


    private static Scanner key = new Scanner(System.in);

    
    public static void event(int minute, String text)
{
    pause(2000);
    System.out.println(minute + "':");

    pause(2000);
    System.out.println(text);
}

    

     public static void playMatch(Team team, Season season, String opponent, int opponentStrength){


        System.out.println("========== MATCHDAY ==========");
        System.out.println("Underdog FC vs " + opponent);

        
        int yourGoals = 0;
        int opponentGoals = 0;

        //first half events
        System.out.println("Game Start!!!");

        for (int i = 0; i < 45; i++){

            int chance = randomInt(6) + 1;
            if (randomInt(90) < 5){

                if (chance == 1){

                   
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }

                if (chance == 2){

                    pause(2000);

                    event(i, "Big chance for " + opponent);
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3){

                    event(i, "Yellow card for " + opponent);
                }
                if (chance == 4){
                    event(i, "Yellow card for Underdog FC");
                }
                if (chance == 5){

                   event(i, "Big chance for " + opponent);
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                if (chance == 6){

                    event(i, "Big chance for Undrdog FC");
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                
            }



            
        }

            System.out.println("");

            pause(2000);
            System.out.println("\t\tIt is halftime the score is: " + yourGoals + "-" + opponentGoals);
            System.out.println("\t\tWhat adjustments would you like to make: \n \t\t1: More attacking \n \t\t2: Stay balanced \n \t\t3: defend the goal");
            System.out.print("\t\tChoice: ");

            int choice = key.nextInt();

        for (int i = 45; i < 90; i++){
            if (choice == 1){
                 int chance = randomInt(8);
            if (randomInt(90) < 5){

                if (chance == 1 || chance == 7){
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                }
                if (chance == 2 || chance == 8){

                    pause(2000);

                    event(i, "Big chance for " + opponent);
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3){
                    event(i, "Yellow card for " + opponent);
                }
                if (chance == 4){

                    event(i, "Yellow crad for Underdog FC");
                }
                if (chance == 5){

                    event(i, "Big chance for " + opponent);
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                if (chance == 6){

                    event(i, "Big chance for Undrdog FC");
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                
            }


            }

            if (choice == 2){
                 int chance = randomInt(6);
            if (randomInt(90) < 5){

                if (chance == 1){
                    
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }
                if (chance == 2){
                    pause(2000);

                    event(i, "Big chance for " + opponent);
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3){

                    event(i, "Yellow card for " + opponent);
                }
                if (chance == 4){

                    event(i, "Yellow crad for Underdog FC");
                }
                if (chance == 5){

                    event(i, "Big chance for " + opponent);
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                if (chance == 6){

                    event(i, "Big chance for Undrdog FC");
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                
            }
            }
            
            if (choice == 3){
                 int chance = randomInt(8);
            if (randomInt(90) < 5){

                if (chance == 1){
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }
                if (chance == 2){

                    pause(2000);

                    event(i, "Big chance for " + opponent);
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3 || chance == 7){

                    event(i, "Yellow card for " + opponent);
                }
                if (chance == 4){

                    event(i, "Yellow card for Underdog FC");
                }
                if (chance == 5 || chance == 8){

                    event(i, "Big chance for " + opponent);
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                if (chance == 6){

                    event(i, "Big chance for Undrdog FC");
                    pause(1234);
                    System.out.println("No goal.");
                    
                }
                
            }
            }
                
            else{
            int chance = randomInt(6);
            if (randomInt(90) < 5){

                if (chance == 1){
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }
                if (chance == 2){

                    pause(2000);

                    event(i, "Big chance for " + opponent);
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent);
                    opponentGoals += 1;
                    
                }
                if (chance == 3){

                    event(i, "Yellow card for " + opponent);
                }
                if (chance == 4){

                    event(i, "Yellow card for Underdog FC");
                }
                if (chance == 5){

                    event(i, "Big chance for " + opponent);

                    System.out.println("No goal.");
                    
                }
                if (chance == 6){

                    event(i, "Big chance for Undrdog FC");

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
