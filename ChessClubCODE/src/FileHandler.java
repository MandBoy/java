import java.util.Scanner;
import java.io.*;
public class FileHandler {
//memberNumber;firstName;lastName;birthday;gender;cpr;phoneNumber;email;dateOfCreation;paymentStatus
    File memberDatabase = new File("../dbfiles/memberDatabase");
    //Constructor
    public FileHandler(){};

    //Skriv til sidste linje i fil.
    public boolean appendLine(File file, String line){
        try {
            Scanner scanner = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.toString(), true));
            bw.write(line);
            bw.newLine();
            bw.flush();
            bw.close();
            scanner.close();
            System.out.println("line was added\n" + line);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
            return false;
        }
        catch (IOException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    //Slet specifikt linjenummer
    public boolean deleteLine(int lineNumber){return true;}

    //Opdater en given linje.
    public boolean updateLine(int lineNumber){return true;}

    //Læs en linje.
    public boolean readLine(int lineNumber){return true;}

}
