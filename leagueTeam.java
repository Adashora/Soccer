public class leagueTeam
{
    private String name;
    private int wins;
    private int draws;
    private int losses;
    private int points;
    private int goalsFor;
    private int goalsAgainst;

    public leagueTeam(String name)
    {
        this.name = name;
        wins = 0;
        draws = 0;
        losses = 0;
        points = 0;
    }

    public String getName(){

        return name;
    }
    public int getPoints(){
        return points;
    }
    public int getWins(){
        return wins;
    }
    public int getDraws(){
        return draws;
    }
    public int getLosses(){
        return losses;
    }
    public void addWin(){
        wins++;
        points += 3;
    }
    public void addDraw(){
        draws++;
        points += 1;
    }
    public void addLoss(){
        losses++;
        
    }
    public void addPoints(int amount){ points += amount; }
    
    public void addGoal(int goals){
        goalsFor += goals;
    }
    public void addGoalAgainst(int goals){
        goalsAgainst += goals;
    }


    public void sortTeams(){
        
    }
}
    

    
