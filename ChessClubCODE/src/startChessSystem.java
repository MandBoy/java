import java.io.*;
import java.util.*;
public class startChessSystem {

    public static void main(String[] args){
        //testing
        File f = new File("../dbfiles/memberDatabase");
        FileHandler fH = new FileHandler();
        fH.appendLine(f, "TestString");

        //prod
        //CallSystem();

    }
    private static void CallSystem(){
        ChessSystem chessSystem = new ChessSystem();
    }
}
