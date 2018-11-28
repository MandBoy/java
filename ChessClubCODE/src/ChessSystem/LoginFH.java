package ChessSystem;
import java.io.File;

public class LoginFH extends FileHandler {

    private File userLogins = new File("dbfiles/userLogins");

    public LoginFH(){
    }
    public String verifyUserCredentials(String username, String password){
        username = username.toLowerCase();

        int lineNum = 1;
        String lineFull = ".";
        String[] lineArray;

        while(lineFull != ""){

            //username;password;role
            lineFull = readLine(userLogins, lineNum);
            //line[] indeholder nu de 3 elementer
            lineArray = lineFull.split(";");

            //check username + password
            if(lineArray[0].equals(username) && lineArray[1].equals(password)){
                return lineArray[2];
            }
            lineNum++;
        }
        return "";
    }
}
