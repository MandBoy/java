public class FredagsBar {
   //attributter
   private int antalOel;
   private int antalSodavand;
   private double prisOel;
   private double prisSodavand;
   private String navn;
   private boolean erAaben;
   //konstruktører
   public FredagsBar() 
   {
      this.antalOel = 0;
      this.antalSodavand = 0;
      this.prisOel = 0.0;
      this.prisSodavand = 0.0;
      this.navn = "not set";
      this.erAaben = false;   
   }
   
   public FredagsBar(String navnPaaNyBar)
   {
      this.navn = navnPaaNyBar;
      this.antalOel = 0;
      this.antalSodavand = 0;
      this.prisOel = 0.0;
      this.prisSodavand = 0.0;
      this.erAaben = false;
      
   }
   //get/set
     public void setErAaben(boolean aaben){
         this.erAaben = aaben;
     }
     public boolean getErAaben() {
         return this.erAaben; 
     }
     public void setAntalSodavand(int antalSodavand) {
         this.antalSodavand = antalSodavand;
     }
     
     public void setPrisSodavand(double prisSodavand) {
         this.prisSodavand = prisSodavand;
     }

   // metoder
   
     public void reklame() {
      //reklamer for fredagsbar.
         System.out.println("Fredagsbar: " + this.navn);
         System.out.println("Der er: " + this.antalSodavand + " sodavand og prisen er: " + this.prisSodavand);
         System.out.println("Der er: " + this.antalOel + " oel og prisen er: " + this.prisOel);
         if (this.erAaben) {
            System.out.println("Baren er åbeeeen");
         }
         else {
            System.out.println("Baren er lukket");
         }
     }
}