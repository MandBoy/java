//https://alvinalexander.com/programming/printf-format-cheat-sheet
import java.util.Random;
public class Rand
{
   public static void main(String[] args)
   {
      //brug printf("formatstreng", paramater1, parameter2, ..., paramtern);
      System.out.printf("Formatter int: %10d er tallet og decimaltallet er: %.4f, streng: %s", 10027, 1003.14159265, "Hej!");
      //%d er heltal, %f er decimaltal, %.2f betyder 4 cifre efter komma, %s er tekststreng
      //%04d sætter 4 karakterer af til tallet og foranstiller 0'er så alle pladser bruges
      System.out.println();
      int x= 42;
      double y = Math.PI;
      
      //%8.2f afsætter plads til 8 karakterer, med 2 decimaler
      System.out.printf("Formatter int: %04d er tallet og decimaltallet er: %8.2f", x, y);
      System.out.println();
      
      //konstant med antallet af tal vi skal bruge
      final int ANTAL = 10;
      
      //instantier random objekt
      Random ran = new Random();
      
      for (int i=0; i<ANTAL; i++)
      {
         //tilfædigt tal mellem 0 og 1
         double r1 = Math.random();
         //næste heltal
         int r2 = ran.nextInt(100);
         System.out.printf("Math.random(): %7.4f ran.nextInt(): %2d%n", r1, r2);
      }
   }
}