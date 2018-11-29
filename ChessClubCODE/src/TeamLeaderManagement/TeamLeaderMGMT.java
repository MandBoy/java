/**
 *
 * <h1> Hello, world</h1>
 * The Hellow wordl .. .. . . .. .
 * <p>Hej hej hej hej para</p>
 *
 * <b>BOLD</b>
 *
 * @author
 * @code
 * @docRoot
 *
 */

package TeamLeaderManagement;
import ChessSystem.InputHandler.*;

public class TeamLeaderMGMT {
    TeamLeaderFH teamLeaderFH = new TeamLeaderFH();
    Rating rating;
    Reads input = new Reads();

    public TeamLeaderMGMT(){
        showMenuTeamLeader();


        switch (input.readInt()){
            case 1:
                createNewRating();
                break;
            default:
                System.out.println("Indstast andet tal");
                break;
        }
    }
    public boolean createNewRating(){
        rating = new Rating();
        if(teamLeaderFH.appendLine(teamLeaderFH.getStrengthList(), rating.toString())){
         return true;
        }
        return false;
    }
    public boolean printRatings() {
        return true;
    }
    public boolean updateRating(){return true;}
    public boolean deleteRating(){return true;}
    public boolean generateStrengthList(){return true;}
    public void showMenuTeamLeader(){
        System.out.println("1. Create new rating");
    }


}
