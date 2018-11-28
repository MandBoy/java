package ChessSystem;
import java.util.Scanner;
import java.io.*;
public class FileHandler {

    File tempFile = new File("dbfiles/tempFile");
    PrintStream output;
    Scanner scanner;

    //Constructor
    public FileHandler(){};

    //Skriv til sidste linje i fil.
    public boolean appendLine(File file, String line){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.toString(), true));
            bw.write(line);
            bw.newLine();
            bw.flush();
            bw.close();
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

    //Læs en linje.
    public String readLine(File file, int lineNumber){
        try {
            int count = 1;
            scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNextLine()){
                while (count < lineNumber){
                    scanner.nextLine();
                    count++;
                }
                //Hvis der er en næste linje returner linjen.
                if(scanner.hasNextLine()){
                    return scanner.nextLine();
                }
            }
        }catch(FileNotFoundException e) {
            System.out.println(e);
            return "";
        }
        System.out.println("line could not be found");
        return "";
    }

    //Opdater en given linje.
    public boolean updateLine(File file, int lineNumber, String updateLine){
        try {
            int count = 1;
            output = new PrintStream(tempFile.toString());
            scanner = new Scanner(file, "UTF-8");

            //udskriv linje for linje til tempfil.
            //indtil lineNumber der skal opdateres med updateString..
            while(count < lineNumber){
                output.print(scanner.nextLine() + "\n");
                count++;
            }

            //hop linjen der skal opdateres over.
            scanner.nextLine();

            //Opdater linjen med ny string.
            output.print(updateLine + "\n");
            count++;

            //skriv resterende linjer til tempfilen til der ikke er flere linjer.
            while(scanner.hasNextLine()){
                output.print(scanner.nextLine() + "\n");
            }
            //luk printStream.
            output.close();

            //kopier tempFile til filen.
            copyFile(tempFile, file);

        }catch(FileNotFoundException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    //Slet specifikt linjenummer
    public boolean deleteLine(File file, int lineNumber){
        try {
            int count = 1;
            output = new PrintStream(tempFile.toString());
            scanner = new Scanner(file, "UTF-8");

            //udskriv linje for linje til tempfil.
            //indtil lineNumber der skal slettes.
            while(count < lineNumber){
                output.print(scanner.nextLine() + "\n");
                count++;
            }

            //skip line / delete linje.
            scanner.nextLine();
            count++;

            //skriv resterende til der ikke er flere linjer.
            while(scanner.hasNextLine()){
                output.print(scanner.nextLine() + "\n");
            }
            //luk printStream.
            output.close();

            //kopier tempFile til filen.
            copyFile(tempFile, file);

        }catch(FileNotFoundException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean copyFile(File source, File destination){
        try {
            //overskriv source til fil.
            Scanner input = new Scanner(source);
            output = new PrintStream(destination);

            while(input.hasNextLine()){
                output.println(input.nextLine());
            }
            input.close();
            output.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Fejl: " + e);
            return false;
        }
        return true;
    }

}
