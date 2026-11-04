public class Matchup{
    private leagueTeam team1;
    private leagueTeam team2;

    public Matchup(leagueTeam team1, leagueTeam team2){
        this.team1 = team1;
        this.team2 = team2;
    }
    public leagueTeam getTeam1(){
        return team1;
    }
    public leagueTeam getTeam2(){
        return team2;
    }
    public String toString(){
        return team1.getName() + " vs " + team2.getName();
    }
}