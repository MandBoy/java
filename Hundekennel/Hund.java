public class Hund
{
   
   //private felter
   private String navn = "";
   private String farve = "";
   private int alder = 0;
   private double vaegt = 10.0;
   
   //konstruktør //skal hedde detsamme som klassen. Nedenstående værdier bliver automatisk assigned hvis et objekt af klassen bliver oprettet
   public Hund(){
      navn = "Ludvig";
      farve = "brun";
      alder = 0;
      vaegt = 12.0;
      
   }
   public Hund(String navn, String farve, int alder, double vaegt)
   {
      this.navn = navn;
      this.farve = farve;
      this.alder = alder;
      this.vaegt = vaegt;     
   }
  
   //metode til udskrift af hunde
   public void setNavn(String navn) {
      this.navn = navn;
   }
   public void setFarve(String farve) {
      this.farve = farve;
   }
   public void setAlder(int alder) {
      this.alder = alder;
   }
   public void setVaegt(double vaegt) {
      this.vaegt = vaegt;
   } 
   public void hundeInfo(){
      System.out.println("Navn:\t\t" + navn);
      System.out.println("Farve:\t" + farve);
      System.out.println("Alder:\t" + alder + " år");
      System.out.println("Vaegt:\t" + vaegt + " kg\n");
   }
   

   

}