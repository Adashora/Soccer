import java.util.Scanner;

public class Match {

    public static void pause(int a){ //puse in milliseconds


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

    
    public static void event(int minute, String text) //prints out an event with pauses
{
    pause(2000);
    System.out.println(minute + "':");

    pause(2000);
    System.out.println(text);
}

    

     public static void playMatch(Team team, Season season, leagueTeam opponent, int opponentStrength){
        


        System.out.println("========== MATCHDAY ==========");
        System.out.println("Underdog FC vs " + opponent.getName());

        
        int yourGoals = 0;
        int opponentGoals = 0;

        //first half events
        System.out.println("Game Start!!!");

        for (int i = 0; i < 45; i++){ //gives a random chance of an event in the first half

            int chance = randomInt(6) + 1; //makes chance random
            if (randomInt(90) < 5){ 

                if (chance == 1){ 

                   
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }

                if (chance == 2){

                    pause(2000);

                    event(i, "Big chance for " + opponent.getName());
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent.getName());
                    opponentGoals += 1;
                    
                }                                                                       //first half chances
                if (chance == 3){

                    event(i, "Yellow card for " + opponent.getName());
                }
                if (chance == 4){
                    event(i, "Yellow card for Underdog FC");
                }
                if (chance == 5){

                   event(i, "Big chance for " + opponent.getName());
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

            System.out.println(""); //prints out the halftime score and options

            pause(2000);
            System.out.println("\t\tIt is halftime the score is: " + yourGoals + "-" + opponentGoals);
            System.out.println("\t\tWhat adjustments would you like to make: \n \t\t1: More attacking \n \t\t2: Stay balanced \n \t\t3: defend the goal");
            System.out.print("\t\tChoice: ");

            int choice = key.nextInt();

        for (int i = 45; i < 90; i++){ //same loop for second half
            if (choice == 1){
                 int chance = randomInt(8); //increases chance for goals -- otherwise the same
            if (randomInt(90) < 5){

                if (chance == 1 || chance == 7){
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                }
                if (chance == 2 || chance == 8){

                    pause(2000);

                    event(i, "Big chance for " + opponent.getName());
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent.getName());
                    opponentGoals += 1;
                    
                }
                if (chance == 3){
                    event(i, "Yellow card for " + opponent.getName());
                }
                if (chance == 4){

                    event(i, "Yellow crad for Underdog FC");
                }
                if (chance == 5){

                    event(i, "Big chance for " + opponent.getName());
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

            if (choice == 2){ //keep the same
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

                    event(i, "Big chance for " + opponent.getName());
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent.getName());
                    opponentGoals += 1;
                    
                }
                if (chance == 3){

                    event(i, "Yellow card for " + opponent.getName());
                }
                if (chance == 4){

                    event(i, "Yellow crad for Underdog FC");
                }
                if (chance == 5){

                    event(i, "Big chance for " + opponent.getName());
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
            
            if (choice == 3){ // increases chance for yellow card and nuetral events
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

                    event(i, "Big chance for " + opponent.getName());
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent.getName());
                    opponentGoals += 1;
                    
                }
                if (chance == 3 || chance == 7){

                    event(i, "Yellow card for " + opponent.getName());
                }
                if (chance == 4){

                    event(i, "Yellow card for Underdog FC");
                }
                if (chance == 5 || chance == 8){

                    event(i, "Big chance for " + opponent.getName());
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
            int chance = randomInt(6); //no change
            if (randomInt(90) < 5){

                if (chance == 1){
                    event(i, "Big chance for Underdog FC");
                    pause(1234);
                    System.out.println("GOALLLLLLL UNDERDOG FC");
                    yourGoals += 1;
                    
                }
                if (chance == 2){

                    pause(2000);

                    event(i, "Big chance for " + opponent.getName());
                    pause(1234);

                    System.out.println("GOALLLLLL " + opponent.getName());
                    opponentGoals += 1;
                    
                }
                if (chance == 3){

                    event(i, "Yellow card for " + opponent.getName());
                }
                if (chance == 4){

                    event(i, "Yellow card for Underdog FC");
                }
                if (chance == 5){

                    event(i, "Big chance for " + opponent.getName());

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
        System.out.println("Underdog FC " + yourGoals + " - " + opponentGoals + " " + opponent.getName()); //[rints full time score]

       
       
        if (yourGoals > opponentGoals)
        {
            League.findTeam("Underdog FC").addWin();                    //gives points to the winning/drawing team
            
            team.addPoints(3);
            
            season.addWin();
            System.out.println("Victory!");
        }
        else if (yourGoals == opponentGoals)
        {
            team.addPoints(1);
            League.findTeam("Underdog FC").addDraw();
            opponent.addDraw();
            season.addDraw();
            System.out.println("Draw.");
        }                                                                   //LATER: add goals scored and goals against
        else
        {
            season.addLoss();
            League.findTeam("Underdog FC").addLoss();
            opponent.addWin();
            System.out.println("Defeat.");
        }
        

    }
    
    
}
