package ChessSystem;

import java.io.*;

public class startChessSystem {

    public static void main(String[] args){
        //test af fileHandler
        File f = new File("dbfiles/memberDatabase");
        FileHandler fH = new FileHandler();
        System.out.println(fH.readLine(f, 5));
        fH.updateLine(f, 5, "HEJ");

        //prod
        CallSystem();

    }
    private static void CallSystem(){
        ChessSystem chessSystem = new ChessSystem();
    }
}
