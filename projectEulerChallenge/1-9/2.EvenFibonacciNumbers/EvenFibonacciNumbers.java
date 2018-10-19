import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class EvenFibonacciNumbers {
   public static void main(String[] args) {
   //udregn tid
   long lStartTime = System.currentTimeMillis();
   
   ArrayList<Double> sequenceNumbersLess4Mill = new ArrayList<Double>();
      
   double var1 = 1;
   double var2 = 2;
   double score;
   
   for(int i = 0; i < 100; i++){   
      score = var1 + var2;
      System.out.println(score);
      var1 = var2;
      var2 = score;
      if(score % 2 == 0 && score <= 4000000) {
         sequenceNumbersLess4Mill.add(score);
      }
   } 
   
   
   double sum = 0;
   for (int i = 0; i < sequenceNumbersLess4Mill.size(); i++){
      sum += sequenceNumbersLess4Mill.get(i);
   }
   System.out.println(sum);

   
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}
