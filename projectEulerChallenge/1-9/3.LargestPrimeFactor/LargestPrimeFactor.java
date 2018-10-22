import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.lang.Math;
public class LargestPrimeFactor {
   public static void main(String[] args) {
   //start tid
   long lStartTime = System.currentTimeMillis();
   //------------------------------------------
   

   //double testNumber = Math.ceil(Math.sqrt(600851475143L));
   //System.out.println(testNumber);
   Long testNumber = 775147L;
   
   ArrayList<Long> list = new ArrayList<Long>();
   ArrayList<Integer> nonPrimeList = new ArrayList<Integer>();
   

      for(long i = 2; i < testNumber; i++){
         //System.out.println(i);
         
         if(testNumber % i == 0){
            System.out.println("got there" + i);
            list.add(i);
         }
      }

   //------------------------------------------
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }

}