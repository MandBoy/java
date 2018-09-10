public class Hundekennel
{
   
   public static void main(String[] args){
      //lav et par hunde
      //brug konstruktør
      Hund hund1 = new Hund();
      Hund hund2 = new Hund(); 
   
      hund1.setNavn("Pluto");
      hund1.setFarve("Sort");
      hund1.setAlder(18);
      hund1.setVaegt(30.5);
      
      hund1.hundeInfo();
      
      //hund2.setHund("Fiddo", "Grøn", 20, 40);
      //hund2.hundeInfo();
      
      
      Hund hund3 = new Hund();
      hund3.hundeInfo();
      
      Hund hund4 = new Hund("Bente", "Sort", 50, 70);
      hund4.hundeInfo();
      

   }
   
}