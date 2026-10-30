public class Text {

    public static void intro(){
        System.out.println("==================================");
        System.out.println("      UNDERDOG FC MANAGER");
        System.out.println("==================================");
        System.out.println("Board Goal: Earn 20 points in 12 matches.");
        System.out.println();

    }

    public static void Weeks(Team team, Season season){
        

        System.out.println();
        System.out.println("\t\t========== WEEK " + season.getMatchNumber() + " ==========");
        System.out.println("\t\tFitness: " + team.getFitness());
        System.out.println("\t\tMorale: " + team.getMorale());
        System.out.println("\t\tTactics: " + team.getTactics());
        System.out.println("\t\tLeague Points: " + team.getPoints());
        System.out.println();

    }

    public static void end(){

        Season season = new Season();
        Team team = new Team();


        System.out.println("\n========== SEASON COMPLETE ==========");
        System.out.println("Wins: " + season.getWins());
        System.out.println("Draws: " + season.getDraws());
        System.out.println("Losses: " + season.getLosses());
        System.out.println("Points: " + team.getPoints());
    }
    
}
