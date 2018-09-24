public class Skole {
   public static void main(String[] args) {
      Studerende student1 = new Studerende("Andreas", "dat18c");    
      student1.setMaalStuderende(1.75, 95);
      student1.beregnBMI();
      
      Studerende student2 = new Studerende("Christoffer", "dat18c");    
      student2.setMaalStuderende(1.75, 50);
      student2.beregnBMI();
      
      Studerende student3 = new Studerende("Daniel", "dat18c");    
      student3.setMaalStuderende(1.90, 80);
      student3.beregnBMI();
      
      System.out.println(student3.erPrimtal(11));
      
      student3.printPrimtal(10);
   }
}