import java.util.Scanner;
public class Skole {
   public static void main(String[] args) {
   
      Studerende stud[] = new Studerende[3]; 
      
      stud[0] = new Studerende("Andreas", "dat18c");   
      stud[1] = new Studerende("Christoffer", "dat18c");  
      stud[2] = new Studerende("Daniel", "dat18c");  
      
      //opret scanner object      
      Scanner scanner = new Scanner(System.in);
      
      //Test om tal er et primtal
      System.out.println("Tast et tal og tjek om det er primtal");
      int tal = scanner.nextInt();
      
      if(StudentCalc.erPrimtal(tal)) {
         System.out.println(tal + " er et primtal");
      }
      else {
         System.out.println(tal + " er ikke et primtal");
      }
      
      //Udskriv primt til fra 0 til indtastet tal
      System.out.println("tast et tal og udskriv alle primtal fra 0 til tallet du skrev\n");
      StudentCalc.printPrimtal(scanner.nextInt());
      
      //Beregn Bmi funktion.
      
      stud[0].setVaegt(75);
      stud[0].setHoejde(1.80);
      StudentCalc.beregnBMI(stud[0]);
      
      
      for (Studerende student : stud) {
         System.out.println(student.toString());
         System.out.println(StudentCalc.beregnBMI(student));
      } 
      
      //Lav et program, der udregner sum og gennemsnit af positive heltal. 
      //Når der tastes 0, skal der beregnes (uden at inkludere 0). Brug en while løkke.
      
      scanner.close();
      
   }
}