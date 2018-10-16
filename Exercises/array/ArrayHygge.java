import java.util.*;

public class ArrayHygge
{

   public static void main(String[] args)
   {
      
   Scanner scanner = new Scanner(System.in);
   
   int[] Array = {1, 2, 3, 4, 2};
      
   System.out.println(returnFirstValue(Array, 2));
   System.out.println(returnLastValue(Array, 2));
   
   }


   public static int returnFirstValue(int[] list, int tal)
   {
      for(int i = 0; i < list.length; i++)
      {
         if(list[i] == tal)
         {
            return i;
         }
         
      }  
      return -1;
   }
   
   public static int returnLastValue(int[] list, int tal)
   {
      for(int i = list.length-1; i > 0; i--)
      {
         if(list[i] == tal)
         {
            return i;
         }
         
      }  
      return -1;
   }

}