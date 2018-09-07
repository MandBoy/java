public class Hund
{
   
   //private felter
   String navn = "";
   String farve = "";
   int alder = 0;
   double vaegt = 10.0;
  
   //metode til udskrift af hunde
   public void setNavn(String name) {
      navn = name;
   }
   public void setFarve(String color) {
      farve = color;
   }
   public void setAlder(int age) {
      alder = age;
   }
   public void setVaegt(double weight) {
      vaegt = weight;
   } 
   public void hundeInfo(){
      System.out.println("Navn:\t\t" + navn);
      System.out.println("Farve:\t" + farve);
      System.out.println("Alder:\t" + alder + " år");
      System.out.println("Vaegt:\t" + vaegt + " kg\n");
   }
   public void setHund(String name, String color, int age, double weight)
   {
      navn = name;
      farve = color;
      alder = age;
      vaegt = weight;     
   }
}