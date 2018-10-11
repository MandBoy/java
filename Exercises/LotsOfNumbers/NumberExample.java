public class NumberExample
{
   //attributes
   private double max;
   private double min;

   //constructor
   public NumberExample(double max,double min)
   {
      this.max = max;
      this.min = min;
   }
   //getter
   public double getMax() { return max;  }
   public double getMin() { return min;  }
   
   //toString metode til at printe
   public String toString()
   {
      return "Intervallet is: " + max + "-" + min;
   }
   
   //metode til at tjekke, om to talintervaller er ens 
   public boolean equals(NumberExample tal)
   {
   if ((this.getMax() == tal.getMax()) && (this.getMin() == tal.getMin()))
   { 
   return true; 
   }
   else
   { 
      return false;
   }
   }
   //metode til tjekke, om et tal er inden for intervallet

   public boolean contain(double testTal)
   {
   if ((this.getMin() <= testTal) && (this.getMax() >= testTal))
   {
      return true;
   }
   else
   {
      return false;
   }   
   }
}