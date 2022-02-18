public class BasketballTeam implements Team {
//variable declaration
    String TeamName;
    int points;

    public BasketballTeam() {
        // TODO Auto-generated constructor stub
    }

    public BasketballTeam(String TeamName, int points) {
        this.TeamName=TeamName;
        this.points=points;
    }
    @Override
    public String toString() {
        return "BasketballTeam [TeamName=" + TeamName + ", points=" + points + "]";
    }

    @Override
    //method for  update points
    public void updatePoints(String result) {
        // TODO Auto-generated method stub
        switch (result) {
            case "Win":
                this.points = this.getPoints() + 2;
                break;

            case "Lose":

                break;

            case "Drawn":
                break;

            default:
                break;
        }
    }

    @Override
    //method for team name
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
