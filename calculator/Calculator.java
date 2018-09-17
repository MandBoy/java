public class Calculator
{
   public static void main(String[] args) 
   {
      InputHandler input;
      double var1;
      double var2;
      double menuchoose;
      String operator;
      input = new InputHandler(System.in);
      
      System.out.println("1. New Calc");
      System.out.println("2. Exit");
      menuchoose = input.readDouble();
      if (menuchoose == 1)
      {
      System.out.println("Enter no. 1: "); 
      var1 = input.readDouble();
      System.out.println("Enter no. 2: ");
      var2 = input.readDouble();
      System.out.println("Enter operator: +, -, * or /");            
      operator = input.readString();
      
      Calculate calculate = new Calculate(var1, var2, operator);
      System.out.println(calculate.getTotal());
      }
      else if (menuchoose == 2) {
         return;
      }
      else {
         System.out.println("Please choose 1 or 2");
      }
      

            

   
   

   }
}