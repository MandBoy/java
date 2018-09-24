public class Studerende {
   String navn;
   String klasse;
   double vaegt;
   double hoejde;
   
   public Studerende(){
      this.navn = "not set";
      this.klasse = "not set";
   }
   public Studerende(String navn, String klasse){
      this.navn = navn;
      this.klasse = klasse;
   }
   public String getNavn(){
      return this.navn;
   }
   public void setNavn(String navn){
      this.navn = navn;
   }
   public String getKlasse(){
      return this.klasse;
   }
   public void setKlasse(String klasse){
      this.klasse = klasse;
   }
   public double getHoejde(){
      return this.hoejde;
   }
   public void setHoejde(double hoejde){
      this.hoejde = hoejde;
   }
   public double getVaegt(){
      return this.vaegt;
   }
   public void setVaegt(double vaegt){
      this.vaegt = vaegt;
   }
   public void setMaalStuderende(double hoejde, double vaegt) {
      this.hoejde = hoejde;
      this.vaegt = vaegt;
   }
   public void beregnBMI(){
   double bmi = (this.vaegt/(this.hoejde*this.hoejde));

   System.out.println(this.navn + "\tBMI tal:\t " + bmi);
   if (bmi < 18.5) {
      System.out.println("Eleven er undervægtig");
   }
   else if(bmi < 25) {
      System.out.println("Eleven er normalvægtig");
   }
   else{
      System.out.println("Eleven er overvægtig");
   }
   }
   
   public boolean erPrimtal(int tal) {
      for (int i = 2; i < tal; i++) {
         if (tal % i == 0)
         {
            return false;
         }
      }
      return true;
   }
   public void printPrimtal(int count){   
      for (int i = 2; i < count; i++) {
         if(erPrimtal(i))
         {
            System.out.println(i);
         }
      }
   }
}