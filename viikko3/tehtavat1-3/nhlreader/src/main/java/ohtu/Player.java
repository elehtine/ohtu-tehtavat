package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private int assists;
    private int goals;
    private String team;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public int compareTo(Player other) {
        return other.goals + other.assists - this.goals - this.assists;
    }

    @Override
    public String toString() {
        return String.format("%-20s %s   %-2d + %-2d = %-2d", name, team, goals, assists, goals + assists);
    }
      
}
