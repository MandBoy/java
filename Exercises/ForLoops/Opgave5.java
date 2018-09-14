/*Do the same as exercise 5, but now only as many lines as there's stars in each line.
   // Example
    print(3);
    // Should print
    * * *
    * * *
    * * *

    print(5);
    // Should print
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 

*/

class Opgave5 {
   public static void main(String[] args) {
      print(3);
      System.out.println();
      print(5);
   }
   public static void print(int count){
      for (int i= 0; i < count; i++){
      System.out.println();
         for (int j = 0; j < count; j++){
         System.out.print("* ");
         }
         
         
      }
   }
} 