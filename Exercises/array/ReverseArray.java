import java.util.Arrays;

public class ReverseArray
{
   public static void main(String[] args) {
      int[] tal = { 0, 1, 2, 3};
      System.out.println(Arrays.toString(tal));
      for(int i= 0; i < tal.length/2; i++){
         //System.out.println(i + ": " + (tal.length - 1 - i));
         //swap element
         swap(tal, i, tal.length - 1 - i);
      }
      System.out.println(Arrays.toString(tal));
   }
   
   public static void swap(int[] tal, int a, int b ){
      int temp;
      temp = tal[a];
      tal[a] = tal[b];
      tal[b] = temp;
   }
   
}