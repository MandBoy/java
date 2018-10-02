public class Studerende
{
   //attributer
   private String navn;
   private String klasse;
   private double vaegt;
   private double hoejde;

   //konstruktører
   public Studerende()
   {
      this.navn = "";
      this.klasse = "";
      this.vaegt = 0.0;
      this.hoejde = 0.0;
   }
   public Studerende(String navn, String klasse)
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
   
   //metoder
   public void maalStuderende(double hoejde, double vaegt)
   {
      setHoejde(hoejde);
      setVaegt(vaegt);
   }
   public void beregnBMI()
   {
      //beregn BMI
      double bmi = vaegt /(hoejde*hoejde);
      //udskriv BMI
      System.out.print("BMI: " + bmi);
      //klassificer BMI
      if (bmi < 18.5)
      {
         System.out.println(" undervægtig");
      }
      else if ((18.5 <= bmi) && (bmi < 25))
      {
         System.out.println(" normalvægtig");
      }
      else if ((25 <= bmi) && (bmi < 30))
      {
         System.out.println(" overvægtig");
      }
      else if (30 <= bmi)
      {
         System.out.println(" fed");
      }
   }
   
   public boolean erPrimtal(int kandidat)
   {
      //undersøg om kandidat er primtal
      int i=2;
      while (kandidat % i != 0)
      {
         i++;
      }
      if (i == kandidat)
      {
         //kun 1 og kandidat går op i kandidat - så er det et primtal
         return true;
      }
      else
      {
         //et andet tal går op i kandidat - så er det ikke et primtal
         return false;
      }
     
   }
}