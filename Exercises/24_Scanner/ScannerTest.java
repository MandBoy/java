import java.util.Scanner;

public class ScannerTest {   
   public static void main(String[] args) {
      
      
      Scanner scanner = new Scanner(System.in);
      
      String s = scanner.nextLine();
      
      System.out.println("Du skrev: " + s); 
      
      System.out.print("Tast et tal: ");
      int tal1 = scanner.nextInt();
      
      System.out.print("Tast endnu et tal: ");
      int tal2 = scanner.nextInt();
      
      int sum = tal1 + tal2;
           
      System.out.println("Summen er: " + sum);
      
      scanner.close();
   
   }
}