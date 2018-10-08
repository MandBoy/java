import java.util.concurrent.TimeUnit;
public class EvenFibonacciNumbers {
   public static void main(String[] args) {
   //udregn tid
   long lStartTime = System.currentTimeMillis();
  
  
   
 
   int[] liste = new int[3];
   
   int sum = 0;
   
   liste[0] = 1;
   liste[1] = 2;
   
   //Loop 1:
   
   //sum += liste[0] + liste[1];
   //liste[0] = liste[1];
   //liste[1] = sum;
  
   
   for (sum = 3; sum < 100; sum += liste[0]) {
    
      sum += liste[1];   
      liste[0] = liste[1];
      liste[1] = sum;
      System.out.println(sum);
   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   

   
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}