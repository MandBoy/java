/*3 . Create a method called greet(), that takes an int as a parameter. The method should print out hello there the amount of times specified in the methods parameter.
// Example:
    greet(3);
    // Should print
    Hello
    Hello
    Hello

*/

class Opgave3 {
   public static void main(String[] args) {
      greet(3);
   }
   public static void greet(int count){
      for (int i = 0; i < count; i++) {
         System.out.println("Hello");
      }  
   }
}  