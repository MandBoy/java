
public class Rand {
      
      public static void main(String[] args){
      
         //brug printf("formatstreng", parameter1, param2, ..., paramtern);
         System.out.printf("Formatter int: %d er tallet\ndecimaltal er: %10.6f", 10027, 3.5);
         //%d er hel tal
         //%f er decimal tal. %2.8f betyder 2 cifre før komma og 8 efter
         
         int x = 42;
         double y = Math.PI;
         
         System.out.printf("\nFormater int: %10d er taller og decimaltallet er: %4.8f", x, y);
         System.out.printf("\nFormater int: %010d er taller og decimaltallet er: %4.2f", x, y);
         
         System.out.printf("\nFormater int: %10d er tallet og decimaltallet er: %10.5f", x,y);
                  
         final int ANTAL = 10;
         for(int i=0; i < ANTAL; i++){
            double r1 = (int)(Math.random() * 6) + 1;
            System.out.printf("%nMath.random(): %1.4f ran.nextInt(): %2", r1);
         
         }
         
         
         
         
      }


}