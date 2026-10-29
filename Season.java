public class Season
{
    private int matchNumber;
    private int wins;
    private int draws;
    private int losses;

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
}
