/* Create a method called print(), that takes an int as a parameter. The method should print out the same as in exercise 1, but should be able to print out a dynamic amount of stars according to the number specified in the parameter.
    // Example
    print(3);
    // Should print
    * * *
    * * *
    * * *
    * * *
    * * *
    * * *
    * * *
    * * *
    * * *
    * * *
*/

class Opgave4 {
   public static void main(String[] args) {
   
   print(3);
  }
  public static void print(int count) {
      for (int i = 0; i < 10; i++) {
         System.out.println();
         for (int j = 0; j < count; j++){
            
            System.out.print("* ");
         }
         
      }
  
  }
}