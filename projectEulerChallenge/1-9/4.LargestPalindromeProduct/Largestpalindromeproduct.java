import java.util.concurrent.TimeUnit;
public class Largestpalindromeproduct {
   public static void main(String[] args) {
   //start tid
   long lStartTime = System.currentTimeMillis();
   //------------------------------------------
   //tal fra 100 til 999
   int[] array = new int[4];   
   int count = 0;
   
   for(int i = 1; i < 100 ; i++){
      for(int j = 1; j < 100; j++){
         int sum = i * j;
      }
   }
   


   //------------------------------------------
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}