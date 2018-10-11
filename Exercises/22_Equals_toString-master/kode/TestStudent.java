public class TestStudent
{
   public static void main(String[] args)
   {
   Student stud1 = new Student ("Peter", "klasse C");
   Student stud2 = new Student ("Helen", "klasse A");
   Student stud3 = new Student ("Hans", "klasse B");
   
   stud3.setNavn("Robert");
   
   stud3.maalStudent(1.89,88.3);
   stud3.beregnBMI();
   System.out.println(stud3.equals(stud2));
   System.out.println(stud3.toString());
   System.out.println(stud3.toString1());
   }

}