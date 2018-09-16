public class Calculate
{   
    private double var1;
    private double var2;
    private double total;
    private String operator;
    
    public double getTotal(){
      return this.total;
    }
    //construct
    public Calculate(double var1, double var2, String operator) 
    {
      this.var1 = var1;
      this.var2 = var2;
      this.operator = operator;
      switch (operator){
         case "+":
         add();
         break;
         case "-":
         subtract();
         break;
         case "*":
         multiply();
         break;
         case "/":
         divide();
         break;
      }
      
    }
    
    private double add(){
      this.total = var1 + var2;
      return this.total;
    }
    private double subtract(){
      this.total = var1 - var2;
      return this.total;
    }
    private double multiply(){
      this.total = var1 * var2;
      return this.total;
    }
    private double divide(){
      this.total = var1 / var2;
      return this.total;
    }
}
