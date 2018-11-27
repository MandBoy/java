import java.util.Scanner;
import java.io.*;
public class LoginFH {
    File userLogins = new File("../dbfiles/userLogins");

    public LoginFH(){
    }
    public String verifyUserCredentials(String username, String password){

        //sæt username til at stå med lower case.
        username = username.toLowerCase();
        try {
            Scanner scanner = new Scanner(userLogins);
            boolean found = false;

            //skip 1 linje (headlines)
            scanner.nextLine();
            while(scanner.hasNextLine()){

                //username;password;role
                //line[] indeholder nu 3 elementer
                String line[] = scanner.next().split(";");

                //check username + password
                if(line[0].equals(username) && line[1].equals(password)){
                    scanner.close();
                    return line[2];
                }
            }
            scanner.close();

        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        //der var blev ikke fundet nogen.
        return "EMPTY";
    }
}
