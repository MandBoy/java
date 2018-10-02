package  EqualsExample;

public class School
{
   
   public static void main(String[] args)
   {
      //lav 3 studerende - sekretæren kender navne og klasser
      Student stud1 = new Student("Rip", "Dat18F");
      Student stud2 = new Student("Rap", "Dat18F");
      Student stud3 = new Student("Rup", "Dat18F");
      
      //sæt 3 studerendes højde og vægt - underviser måler
      stud1.maalStudent(1.72, 87);
      stud2.maalStudent(1.82, 67);
      stud3.maalStudent(1.92, 67);
            
      //beregn bmi - udskriv navn og så beregn BMI
      System.out.println("Student: " + stud1.getNavn());
      stud1.beregnBMI();
      System.out.println("Student: " + stud2.getNavn());
      stud2.beregnBMI();
      System.out.println("Student: " + stud3.getNavn());
      stud3.beregnBMI();
            
      //find ud af om 113 og 117 er primtal
      if (stud1.erPrimtal(113))
      {
         System.out.println("113 er et primtal");
      }
      else
      {
         System.out.println("137 er ikke et primtal");
      }
      if (stud1.erPrimtal(117))
      {
         System.out.println("117 er et primtal");
      }
      else
      {
         System.out.println("117 er ikke et primtal");
      }
      
      //find ud af hvilke tal fra 2 til 100, der er primtal
      System.out.println("Liste over primtal fra 2 til 100");
      for (int i=2;i<=100;i++)
      {
         if (stud2.erPrimtal(i))
         {
            System.out.print(" " + i);
         }
      }
      System.out.println();
      
      //udskriv Java's opfattelse af studerende
      System.out.println("stud1:" + stud1);
      System.out.println("stud2:" + stud2);
      System.out.println("stud3:" + stud3);
      
      //udskriv vha toString
      
      //sammenlign studerende med equals
      
   }
}

