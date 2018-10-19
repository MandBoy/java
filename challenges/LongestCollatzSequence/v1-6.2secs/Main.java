//https://projecteuler.net/problem=14
import java.util.concurrent.TimeUnit;
public class Main {

   public static void main(String[] args) {
   long lStartTime = System.currentTimeMillis();
      
      
      
     LongestChain longestChain = new LongestChain();
     
     double highestCount = 0; 
       
     for (int i = 1000000; i >= 1; i--) {
      longestChain.setCounter(0);
      double count = longestChain.calcNTimes(i); 
      
      if(count > highestCount){
         highestCount = count;        
         System.out.println("Highest count was set to: " + highestCount + " on number: " + i);
      }
     }
      
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);
   }
}
