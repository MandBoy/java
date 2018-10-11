//package LIbraryTest;

public class Calculation{
//@author Päivi Eversbusch

   //beregn BMI med en static metode, returtype double
   public static double beregnBMI(Student obj)
   {
      double bmi = obj.getVaegt() / (obj.getHoejde() * obj.getHoejde());
      return bmi;
   }
   //metode til antallet af studerende
   public static int antalletAfStuderende(Student[] obj)
   {
      return obj.length;
   }
}

