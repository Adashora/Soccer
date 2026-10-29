public class Team
{
    private int fitness;
    private int morale;
    private int tactics;
    private int points;

    public Team()
    {
        fitness = 70;
        morale = 70;
        tactics = 70;
        points = 0;
    }

    public int getFitness(){ return fitness; }
    public int getMorale(){ return morale; }
    public int getTactics(){ return tactics; }
    public int getPoints(){ return points; }

    public void changeFitness(int amount){ fitness += amount; }
    public void changeMorale(int amount){ morale += amount; }
    public void changeTactics(int amount){ tactics += amount; }
    public void addPoints(int amount){ points += amount; }
}
