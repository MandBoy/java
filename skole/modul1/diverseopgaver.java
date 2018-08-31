class Diverseopgaver {
   public static void main(String[] args) {
      //Firkant
      double længde = 2;
      double bredde = 5;
      System.out.println("areal af firkant: " + længde * bredde);
      
      //Trekant
      double højde = 5;
      double grundlinje = 10;
      
      System.out.println("areal af trekant: " + højde * grundlinje * 0.5);
      
      
      //BMI
      double weight = 75;
      double height = 1.70;
      System.out.println("BMI Tal: " + (weight / (height*height)));
      
      
      //Firkant metode
      firkant(5, 5);     
   }
   
   public static void firkant(double newHøjde, double newBredde){
      double højde = newHøjde;
      double bredde = newBredde;
      double areal = newHøjde * newBredde;
      System.out.println("Areal af firkant; " + areal);
   }
}