//package LIbraryTest;

public class Student
{
//@author Päivi Eversbusch
   //attributer
   private String navn;
   private String klasse;
   private double vaegt;
   private double hoejde;

   //konstruktører
   public Student()
   {
      this.navn = "";
      this.klasse = "";
      this.vaegt = 0.0;
      this.hoejde = 0.0;
   }
   public Student(String navn, String klasse)
   {
      this.navn = navn;
      this.klasse = klasse;
      this.vaegt = 0.0;
      this.hoejde = 0.0;
   }
   
   //get-metoder og set-metoder
   public String getNavn()
   {
      return this.navn;
   }
   public void setNavn(String navn)
   {
      this.navn = navn;
   }
   
   public String getKlasse()
   {
      return this.klasse;
   }
   public void setKlasse(String klasse)
   {
      this.klasse = klasse;
   }

   public double getHoejde()
   {
      return this.hoejde;
   }
   public void setHoejde(double hoejde)
   {
      this.hoejde = hoejde;
   }

   public double getVaegt()
   {
      return this.vaegt;
   }
   public void setVaegt(double vaegt)
   {
      this.vaegt = vaegt;
   }
   
   //metode maalStudent
   public void maalStudent(double hoejde, double vaegt)
   {
      setHoejde(hoejde);
      setVaegt(vaegt);
   }
   //equals
   public boolean equals(Student stud)
   {
      if (this.getVaegt() == stud.getVaegt() && this.hoejde == stud.getHoejde() && this.navn == stud.getNavn())
      {
         return true;
         }
      else
      {
        return false;
      }
   }
   
   //toString
   public String toString()
   {
      return "Navnet er " + getNavn();
   }
   
   public String toString1()
   {
      return "Klassen er " + this.klasse;
   }

}