/*Ikke færdig*/

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
   public static List<Integer> list = new ArrayList<>(Arrays.asList());
   public static List<Integer> longestChain = new ArrayList<>(Arrays.asList());    
  
      public static void main(String[] args) {
      //udregn tid
      long lStartTime = System.currentTimeMillis();
      
      //Programkode her.
      
      
          
      for(int i = 2; i <= 13; i++) {
        
      }
      System.out.println(longestChain);
      System.out.println(longestChain.size());
      
      //udskriv tid.
      long lEndTime = System.currentTimeMillis();
      long output = lEndTime - lStartTime;
      System.out.println("Elapsed time in milliseconds: " + output);
   
      }
   
   public static List countChain(int n){
      if(list.contains(n)){
         return list;
      }
      if(n % 2 == 0) {
        list = 2 + countChain(n / 2);
        return list;
      }
      else {
         n = n * 3 + 1;
         list.add(n);
         return list(n);
      }
   }
}