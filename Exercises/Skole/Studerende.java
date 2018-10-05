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
      this.vaegt = 75;
      this.hoejde = 1.80;
   }
   public String getNavn(){ return this.navn; }
   public void setNavn(String navn){ this.navn = navn; }
   
   public String getKlasse(){ return this.klasse; }
   public void setKlasse(String klasse){ this.klasse = klasse; }
   
   public double getHoejde(){ return this.hoejde; }
   public void setHoejde(double hoejde){ this.hoejde = hoejde; }
   
   public double getVaegt(){ return this.vaegt; }
   public void setVaegt(double vaegt) {this.vaegt = vaegt; }
   
   public String toString(){
      return "Name: " + navn + ". Klasse: " + klasse + ". Vaegt: " + vaegt + ". Hoejde: " + hoejde;
   }
}