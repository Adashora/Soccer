import java.util.ArrayList;

public class League {
    private static ArrayList<leagueTeam> teams;
    
    private ArrayList<Matchup> remainingGames;
    private Matchup currentUserMatch;


public League()
{
    teams = new ArrayList<leagueTeam>();

    teams.add(new leagueTeam("Underdog FC"));      //list of all the teams -- including user
    teams.add(new leagueTeam("Madison FC"));
    teams.add(new leagueTeam("Arsenal"));
    teams.add(new leagueTeam("Man City"));
    teams.add(new leagueTeam("Barcelona"));
    teams.add(new leagueTeam("Real Madrid"));
    teams.add(new leagueTeam("Bayern Munich"));
    teams.add(new leagueTeam("Dortmund"));
    teams.add(new leagueTeam("Inter Milan"));
    teams.add(new leagueTeam("Juventus"));
    teams.add(new leagueTeam("PSG"));
    teams.add(new leagueTeam("Monaco"));
    teams.add(new leagueTeam("liverpool"));
    teams.add(new leagueTeam("Chelsea"));


    remainingGames = new ArrayList<Matchup>();

for(int i = 0; i < teams.size(); i++)
{
    for(int j = i + 1; j < teams.size(); j++)
    {
        remainingGames.add(
            new Matchup(teams.get(i), teams.get(j))   //creates a matchup by taking 2 teams in the list
        );
    }
}





}

public int getStrength(){
    int opponentStrength = 55 + randomInt(41);   //gets a random strength for a team
    return opponentStrength;
}

public static int randomInt(int max){
    
    return (int)(Math.random() * max);
    
}
public void printSchedule(){

    for(Matchup game : remainingGames){

        System.out.println(game);
    }

}

public void printTeams() {
    for (leagueTeam team : teams) {
        System.out.println(team.getName());
    }

}

public void simMatch(Matchup game){ //simulates a match between 2 ai teams
    leagueTeam team1 = game.getTeam1();
    leagueTeam team2 = game.getTeam2();


    int score1 = randomInt(5);
    int score2 = randomInt(5);   //randommized score - no logic

    team1.addGoal(score1);
    team2.addGoal(score2);          //adding stats for future detailed table
    team1.addGoalAgainst(score2);
    team2.addGoalAgainst(score1);

    if (score1 > score2){
        team1.addWin();
        team2.addLoss();
    }
    else if (score2 > score1){
        team2.addWin();
        team1.addLoss();
    }
    else{
        team2.addDraw();
        team1.addDraw();
    }

}
public Matchup getCurrentUserMatch() {
    return currentUserMatch;
}

public void simWeek() {
    boolean userMatchChosen = false;
    

    ArrayList<leagueTeam> teamsPlayed = new ArrayList<>();

    int gamesPlayed = 0;
    int index = 0;
    System.out.println("--- Weekly Schedule ---");

    while (gamesPlayed < 6 && index < remainingGames.size()) {

        Matchup game = remainingGames.get(index);

        leagueTeam team1 = game.getTeam1();
        leagueTeam team2 = game.getTeam2();          //creates the schedule for the whole week

        // Skip games involving the user's team
        if(!userMatchChosen && team1.getName().equals("Underdog FC")
        || team2.getName().equals("Underdog FC")) {
           //System.out.println("Found user match: " + game); 
            teamsPlayed.add(team1);
            teamsPlayed.add(team2);            //if underdog fc is playing define current user match

            currentUserMatch = game;
            userMatchChosen = true;
            remainingGames.remove(index);
            index++;
            
}

        // Simulate game if neither team has played this week
        else if ((!teamsPlayed.contains(team1) && !teamsPlayed.contains(team2))) {

            System.out.println(game);
            simMatch(game);                        //simulates the game if both teams havent played yet

            teamsPlayed.add(team1);
            teamsPlayed.add(team2);

            remainingGames.remove(index);

            gamesPlayed++;
        }

        
        

        // One of the teams already played this week
        else {

            index++;
        }

    }
    System.out.println(currentUserMatch);
}
public void sortTeams(){
    for(int i = 0; i < teams.size(); i++)
    {
        for(int j = i + 1; j < teams.size(); j++)
        {
            if(teams.get(j).getPoints() >              //sort teams in the table by most points -- later add tiebreakers
            teams.get(i).getPoints())
            {
            leagueTeam temp = teams.get(i);
            teams.set(i, teams.get(j));
            teams.set(j, temp);
            }
        }
    }
    
}

public static leagueTeam findTeam(String name)
{
    for(leagueTeam team : teams)
    {
        if(team.getName().equals(name))
        {
            return team;
        }
    }

    return null;
}
public void printTable(){
    
    sortTeams();

    System.out.println("\n\t\t\t\t\t\t\t===== LEAGUE TABLE =====");

    for(int i = 0; i < teams.size(); i++)
    {
        System.out.println("\t\t\t\t\t\t\t" + 
            (i + 1) + ". " + teams.get(i).getName() + " - " + teams.get(i).getPoints() + " pts"
        );
    }

    try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
}

}

