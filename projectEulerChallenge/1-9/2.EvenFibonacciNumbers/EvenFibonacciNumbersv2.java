import java.util.ArrayList;
public class EvenFibonacciNumbersv2 {
   public static void main(String[] args) {
   
   ArrayList<Double> fibonacciNumbers = new ArrayList<Double>();
   ArrayList<Double> evenFibonacciNumbers = new ArrayList<Double>();
   double roofNumber = 4000000;
   
   //Tilføj fibonacci numre til liste (overskrider ikke roofNumber.) (se opgave)
   fibonacciNumbers = fibonacciNumbers(roofNumber);
   
   //Udskild de lige numre til ny liste.
   for (double i : fibonacciNumbers){     
      if(chkIfEven(i)){
         evenFibonacciNumbers.add(i);
      }
   }
   
   //beregn summen af arraylisten.
   double sum = sumOfArrayList(evenFibonacciNumbers);
   System.out.println("Summen er: " + sum);   
   
   }

   public static ArrayList<Double> fibonacciNumbers(double roofNumber){
   ArrayList<Double> fibonacciNumbers = new ArrayList<Double>();
   double var1 = 1;
   fibonacciNumbers.add(var1); //given number
   double var2 = 2;
   fibonacciNumbers.add(var2); //given number
   double score = 3;
      do {             
         var1 = var2;
         var2 = score;       
         score = var1 + var2;
         fibonacciNumbers.add(score);
      }while (score <= roofNumber);
   return fibonacciNumbers;
   }
   
   
   public static boolean chkIfEven(double number){
      if(number % 2 == 0){
         return true;
      }
      return false;
   }
   
   public static double sumOfArrayList(ArrayList<Double> list){
      double sum = 0;
      for(double i : list){
         sum += i;
      }
      return sum;   
   }
   
}
