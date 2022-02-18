public class FootballTeam implements Team {

    String TeamName, Sponsor;
    int points;

    public FootballTeam() {
        // TODO Auto-generated constructor stub
    }

    public FootballTeam(String TeamName, int points, String Sponsor) {
        this.TeamName=TeamName;
        this.points=points;
        this.Sponsor=Sponsor;
    }

    @Override
    public String toString() {
        return "FootballTeam [TeamName=" + TeamName + ", Sponsor=" + Sponsor + ", points=" + points + "]";
    }

    @Override
    //method for update points
    public void updatePoints(String result) {
        // TODO Auto-generated method stub
        switch (result) {
            case "Win":
                this.points = this.getPoints() + 3;
                break;

            case "Lose":

                break;

            case "Drawn":
                this.points = this.getPoints() + 1;
                break;

            default:
                break;
        }
    }

    @Override
    //method for get team name
    public String getTeamName() {
        // TODO Auto-generated method stub
        return this.TeamName;
    }

    @Override
    //method for get points
    public int getPoints() {
        // TODO Auto-generated method stub
        return this.points;
    }

}
