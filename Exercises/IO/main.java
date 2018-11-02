import java.io.*;
import java.util.Scanner;

public class main {
   public static void main(String[] args) 
   {
   
   FileHandler fileHandler = new FileHandler();
   
   
   String fileName = "DT.txt";
   //TEST AF FILER
   
   //Eksistere filen?
   if(fileHandler.fileExists(fileName)){
      System.out.println("Filen eksistere");
   }
   else {
      System.out.println("Filen findes ikke");
   }
   //Kan læse filen?
   if(fileHandler.canRead(fileName)){
      System.out.println("Filen kan læses");   
      
   }
   else {
      System.out.println("Filen kan ikke læses");
   }
   
   //læs størrelsen på filen?
   long size = fileHandler.getFileSize(fileName);
   System.out.println("Størrelsen: " + size);
   
   //læs absolute path
   String path = fileHandler.getAbsolutePath(fileName);
   System.out.println(path);
   
   
   //Read file and output
   fileHandler.readInputStreamDoubles("doubles");
   }
   
}