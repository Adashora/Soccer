import java.util.ArrayList;

public class League {
    private ArrayList<leagueTeam> teams;

public League()
{
    teams = new ArrayList<leagueTeam>();

    teams.add(new leagueTeam("Underdog FC"));
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

}
public void printTeams() {
    for (leagueTeam team : teams) {
        System.out.println(team.getName());
    }
}

}
