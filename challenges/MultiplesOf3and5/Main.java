//https://projecteuler.net/problem=1

/*
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class Main {
   public static void main(String[] args) {
   //udregn tid
   long lStartTime = System.currentTimeMillis();
   
   //$x = 1000;
   //echo 1.5*(int)(($x-1)/3)*(int)(($x+2)/3) + 2.5*(int)(($x-1)/5)*(int)(($x+4)/5) - 7.5*(int)(($x-1)/15)*(int)(($x+14)/15);
   
   
   int sum = 3*333*(1+333)/2 + 5*199*(1+199)/2 - 15*66*(1+66)/2;
   System.out.println(sum);
   
   //udskriv tid.
   long lEndTime = System.currentTimeMillis();
   long output = lEndTime - lStartTime;
   System.out.println("Elapsed time in milliseconds: " + output);

   }
}