package TeamLeaderManagement;

import ChessSystem.FileHandler;

import java.io.File;

public class TeamLeaderFH extends FileHandler {
    private File strengthList = new File("dbfiles/strengthList");

    TeamLeaderFH(){

    }
    public File getStrengthList(){
        return this.strengthList;
    }
}
