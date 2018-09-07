public class Car
{

   private int motorSize;
   private int doors;
   private String model;
   private String licensePlate;
   
   public void setCar(int motorSize, int doors, String model, String licensePlate) {
      this.motorSize = motorSize;
      this.doors = doors;
      this.model = model;
      this.licensePlate = licensePlate;
   
   } 
   public void printCar()
   {
      System.out.println("Motor: " + motorSize);
      System.out.println("Doors: " + doors);
      System.out.println("Model: " + model);
      System.out.println("Reg: " + licensePlate);

   }

}