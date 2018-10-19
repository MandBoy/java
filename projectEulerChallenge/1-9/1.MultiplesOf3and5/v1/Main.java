//https://projecteuler.net/problem=1

/*
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.util.concurrent.TimeUnit;
public class Main {
   public static void main(String[] args) {
   //udregn tid
   long lStartTime = System.currentTimeMillis();

   int sum = 0;
   int belowNumber = 1000000000;
   
   for (int i = 1; i < belowNumber; i++) {
      if(i % 3 == 0 || i % 5 == 0) {
         sum += i;
      }
   }
   System.out.println(sum);

      
   
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}