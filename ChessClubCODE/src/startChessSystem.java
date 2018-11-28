import ChessSystem.ChessSystem;
import TeamLeaderManagement.TeamLeaderMGMT;
import ChessSystem.InputHandler;

import java.io.*;

public class startChessSystem {

    public static void main(String[] args){
        //FileHandler Test -----------------------------------------
        //File f = new File("dbfiles/memberDatabase");
        //FileHandler fH = new FileHandler();
        //System.out.println(fH.readLine(f, 5));
        //fH.updateLine(f, 5, "HEJ");

        //TeamleaderMGMT test ---------------------------------
        //InputHandler input = new InputHandler();
        //TeamLeaderMGMT teamLeaderMGMT = new TeamLeaderMGMT(input);

        //prod
        CallSystem();

    }
    private static void CallSystem(){
        ChessSystem chessSystem = new ChessSystem();
    }
}
