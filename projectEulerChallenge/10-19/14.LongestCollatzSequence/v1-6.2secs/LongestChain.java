//https://projecteuler.net/problem=14
public class LongestChain {
   
   int counter = 0;
   double number;  
   
   public LongestChain(){} 
   
   public void setCounter(int counter){this.counter = counter;}
   
   public boolean isEven(double number){
      if (number % 2 == 0){ return true; }
      return false;
   }
   
   public double calcN(double number) {         
         if(isEven(number)){
            number = number / 2;
            this.counter++;
         }
         else if (!isEven(number)){
            number = (number * 3) + 1;
            this.counter++;
         }
      return number;
   }
   public double calcNTimes(double number) {
      this.number = number;
      do {   
         number = calcN(number); 
         if (number == 1) {
            this.counter++;
         }
      } while (number != 1);
      return this.counter;
   }
}