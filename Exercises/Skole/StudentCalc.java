public class StudentCalc {

   public static boolean erPrimtal(int tal) {
      for (int i = 2; i < tal; i++) {
         if (tal % i == 0)
         {
            return false;
         }
      }
      return true;
   }
   
   public static void printPrimtal(int count){   
      for (int i = 2; i < count; i++) {
         if(erPrimtal(i))
         {
            System.out.println(i);
         }
      }
   }
   
   public static String beregnBMI(Studerende student) {
      
      double bmi = (student.getVaegt()/(student.getHoejde()*student.getHoejde()));
   
      String str = (student.getNavn() + "\tBMI tal:\t" + bmi);
      if (bmi < 18.5) {
         return str + ", eleven er undervægtig";
      }
      else if(bmi < 25) {
         return str + ", eleven er normalvægtig";
      }
      else{
         return str + ", eleven er overvægtig";
      }

   }
   
}