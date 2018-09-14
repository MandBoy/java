public class Car
{

   private double motorSize;
   private int doors;
   private String model;
   private String licensePlate;
   
   public Car(){
      doors = 0;
      model = "Model Not Set";
      licensePlate= "PlateNotSet";
      motorSize = 0;
   
   }
   
   public Car(double motorSize, int doors, String model, String licensePlate) {
      this.motorSize = motorSize;
      this.doors = doors;
      this.model = model;
      this.licensePlate = licensePlate;
   
   } 
   public void setMotorSize(double motorSize)
   {
      this.motorSize = motorSize;
   }
   public void setDoors(int doors)
   {
      this.doors = doors;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   public void setLicensePlate(String licensePlate)
   {
      this.licensePlate = licensePlate;
   }
   
   public void printCar()
   {
      System.out.println("--------------");
      System.out.println("Motor: " + motorSize);
      System.out.println("Doors: " + doors);
      System.out.println("Model: " + model);
      System.out.println("Reg: " + licensePlate);

   }

}