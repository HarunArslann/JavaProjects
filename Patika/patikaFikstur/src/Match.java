public class Match {
    private final String name;

    public Match(Team team1, Team team2) {
        this.name = team1.getName() + " vs " + team2.getName();
    }

    public String getName() {
        return name;
    }

}
