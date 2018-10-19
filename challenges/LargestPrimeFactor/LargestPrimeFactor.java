import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class LargestPrimeFactor {
   public static void main(String[] args) {
   //start tid
   long lStartTime = System.currentTimeMillis();
   //------------------------------------------
   

   int testNumber = 13195;
   
   ArrayList<Integer> list = new ArrayList<Integer>();
   
   boolean running = true;
   
   while (running){
      
      for(int i = 2; i < testNumber; i++){
         
         
         
      }
   }

   System.out.println(list.toString());
   
  
   
   //------------------------------------------
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }

}