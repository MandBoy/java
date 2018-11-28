package TeamLeaderManagement;
import ChessSystem.*;

public class TeamLeaderMGMT {
    TeamLeaderFH teamLeaderFH = new TeamLeaderFH();
    Rating rating;
    InputHandler.Reads input;

    public TeamLeaderMGMT(){
        showMenuTeamLeader();
        input = new InputHandler.Reads();

        switch (input.readInt()){
            case 1:
                createNewRating();
                break;
            default:
                System.out.println("Indstast andet tal");
                break;
        }
    }
    public Boolean createNewRating(){
        rating = new Rating();
        if(teamLeaderFH.appendLine(teamLeaderFH.getStrengthList(), rating.toString())){
         return true;
        }
        return false;

    }
    public boolean printRatings() {return true;}
    public boolean updateRating(){return true;}
    public boolean deleteRating(){return true;}
    public boolean generateStrengthList(){return true;}
    public void showMenuTeamLeader(){
        System.out.println("1. Create new rating");
    }


}
