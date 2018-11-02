import java.io.*;
import java.util.Scanner;
public class FileHandler
{
   
   File f;
   Scanner scanner;
   
   FileHandler(){}

   public boolean fileExists(String fileName){
      f = new File(fileName);
      if(f.exists()){
         return true;
      }
      return false;
   }
   
   public boolean canRead(String fileName){
      f = new File(fileName);
      
      if(f.canRead()){
      return true;
      }
      return false;
   }
   public long getFileSize(String fileName){
      f = new File(fileName);
      
      if(f.exists()){
         return f.length();
      }
      else {
         System.out.println("Filen eksistere ikke");
         return 0;
      }
            
   }
   public String getAbsolutePath(String fileName){
      f = new File(fileName);
      return f.getAbsolutePath();
   }
   
   public void readInputStream(String fileName){
      f = new File(fileName);
       
      try {    
         scanner = new Scanner(f);
      
      int antal = 0;
         while(scanner.hasNext()){
            String ord = scanner.next();
            System.out.print(ord + ";");
            antal++;
         }
         System.out.println("\nAntal ord: " + antal);    
      }catch (FileNotFoundException ex){    
      System.out.println("fejl");
      }      
   }
   public void readInputStreamDoubles(String fileName){
      f = new File(fileName);
       
      try {    
         scanner = new Scanner(f);
         double sum = 0;
         int antal = 0;
         while(scanner.hasNext()){
            
            sum += scanner.nextDouble();
            antal++;
         }
         System.out.println("\nAntal tal: " + antal);  
         System.out.println("\nSum: " + sum / antal);  
      }catch (FileNotFoundException ex){    
      System.out.println("fejl");
      }      
   }
   
}