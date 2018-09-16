public class Calculator
{
   public static void main(String[] args) 
   {
      Calculate calculate = new Calculate(50, 50, "*");
      
      System.out.println(calculate.getTotal());
   }
}