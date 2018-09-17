public class Calculator
{
   public static void main(String[] args) 
   {
      
      InputHandler input;
      double var1;
      double var2;
      String operator;
      
      input = new InputHandler(System.in);
      var1 = input.readDouble();
      var2 = input.readDouble();      
      operator = input.readString();
      
      Calculate calculate = new Calculate(var1, var2, operator);
      
      System.out.println(calculate.getTotal());
   }
}