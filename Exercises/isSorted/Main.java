import java.lang.Math;
import java.util.Arrays;
public class Main {


   public static void main(String[] args) {
    
      
      int[] arr = new int[5];
      
      for (int i = 0; i < arr.length; i++) {
         arr[i] = i;      
         System.out.println(arr[i]);
      }
      
      System.out.println(isSorted(arr));
   
   }
   
   public static boolean isSorted(int[] arr) {
      boolean bool = false;   
      for (int i = 0; i < arr.length - 1; i++) { 
  
          if (arr[i] < arr[i + 1]) {
              bool = true;
          }
          else bool
      }
      return false;
   }
}