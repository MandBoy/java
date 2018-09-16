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
    }
    
    public double add(double var1, double var2){
      this.total = var1 + var2;
      return this.total;
    }
    public double subtract(double var1, double var2){
      this.total = var1 - var2;
      return this.total;
    }
    public double multiply(double var1, double var2){
      this.total = var1 * var2;
      return this.total;
    }
    public double divide(double var1, double var2){
      this.total = var1 / var2;
      return this.total;
    }
}
