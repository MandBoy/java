/*6 . Print the folowing to the console using 2 for loops.
 * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * * * 
    * * * * * * * 
    * * * * * * * *  
    * * * * * * * * * 
    * * * * * * * * * *

*/

class Opgave6 {
   public static void main(String[] args) {
      for (int i = 0; i <= 10; i++) {
         System.out.println();
         for (int j = 0; j < i; j++) {
         System.out.print("* ");
         }
      }
   }
} 