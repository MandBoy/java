
import java.util.ArrayList;
import java.lang.Math;
public class LargestPrimeFactor {
   public static void main(String[] args) {
    //dont touch this.
   double testNumber = 13195;

   ArrayList<Integer> list = new ArrayList<Integer>();
   ArrayList<Integer> nonPrimeList = new ArrayList<Integer>();
   
      for(int i = 2; i < testNumber; i++){
         if(testNumber % i == 0){
            list.add(i);
         }
      }
      //nonPrimeList = list;
      for(int i = 0; i < list.size(); i++)
      {
         for(int j = 0; j < list.size(); j++){
            if(list.get(i) % list.get(j) == 0 && list.get(i) != list.get(j)){
               //list.get(i) fjernes fra nonPrimeList.
               nonPrimeList.add(list.get(i));
            }          
         }
      }

      list.removeAll(nonPrimeList);     
      System.out.println(list); 
      System.out.println(list.get(list.size()-1));
      



   }

}