import java.util.concurrent.TimeUnit;
public class Main {
   public static void main(String[] args) {
   //udregn tid
   long lStartTime = System.currentTimeMillis();
   
   
   double startNumber = 13;
   
   double highestCount = 0;
   
   

   for(double i = startNumber; i >= 2; i--){
      
      if(getToOne(i) > highestCount){
            highestCount = getToOne(i);
            System.out.println("Highest count was set to: " + highestCount + " on number: " +i); 
      }
   }
   
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);
   }
   
   public static double getToOne(double newStartNumber) {
      double counter = 0;
      while (newStartNumber!= 1) {
      
         if(newStartNumber%2 == 0) {
            counter++;
            newStartNumber = newStartNumber / 2;
         }
         else {
            counter++;
            newStartNumber = (newStartNumber * 3) + 1;
         }
         if(newStartNumber == 1) { counter++; }
     }
     return counter;
   }
}