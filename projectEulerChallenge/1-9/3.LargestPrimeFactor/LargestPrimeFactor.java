import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class LargestPrimeFactor {
   public static void main(String[] args) {
   //start tid
   long lStartTime = System.currentTimeMillis();
   //------------------------------------------
   //--Plan. 
   //1. Lav liste med tal der går op testnummeret.    
   //2. Træk det højeste tal fra der går op i et mindre tal - lav ny liste med de nye tal.

   int testNumber = 13195;
   
   ArrayList<Integer> list = new ArrayList<Integer>();
   ArrayList<Integer> primeList = new ArrayList<Integer>();
   
   boolean running = true;
   
   while (running){
      //1.
      for(int i = 2; i < testNumber; i++){
         if(testNumber % i == 0){
            list.add(i);
         }
      }
      System.out.println(list);
      System.out.println(5 % 35);
      System.out.println(35 % 5);      
      running = false;
   }

  // System.out.println(list.toString());
   
  
   
   //------------------------------------------
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }

}