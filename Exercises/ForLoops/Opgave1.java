/*1 . Print the folowing to the console using a for loop.
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
*/

class Opgave1 {
   public static void main(String[] args) {
      for (int i = 0; i<10; i++){
         System.out.println();
         for(int j = 0; j <10; j++) {
            System.out.print("* ");
         }
      } 
      
   }
}  