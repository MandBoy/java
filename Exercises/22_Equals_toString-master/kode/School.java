//package LIbraryTest;
import java.util.Arrays;

public class School
{
//@author Päivi Eversbusch
   public static void main(String[] args)
   {
      //lav 3 studerende 
      Student[] stud = new Student[3]; 
      stud[0] = new Student("Anders", "Dat18F");
      stud[1] = new Student("Lotte", "Dat18F");
      stud[2] = new Student("Hans", "Dat18F");

      //sæt 3 studerendes højde og vægt 
      stud[0].maalStudent(1.50, 67);
      stud[1].maalStudent(1.75, 67);
      stud[2].maalStudent(2.00, 67);
     
      //beregn bmi - metodekalde fra Calculation og print
      System.out.println("Student " + stud[0].getNavn() + " BMI:" + Calculation.beregnBMI(stud[0]));
      
      //sammenlign studerende med equals - metodekald fra School   
      System.out.println(stud[0].equals(stud[2]));
      
      //udskriv vha toString - metodekald fra School
      System.out.println(stud[2].toString()); 
      System.out.println(stud[1].toString1());
      
      //antallet af studerende - metodekald fra Calculation
      System.out.println("Antallet af studerende er " + Calculation.antalletAfStuderende(stud));     
   }
}

