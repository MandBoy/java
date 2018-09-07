public class CarBrooker
{

   public static void main(String[] args)
   {
      //lav en ny bil
      Car car1 = new Car();
      car1.setCar(30, 5, "Audi", "AA 27 560");
      
      //car1.setCar(30, 5, "Audi", "AA 27 560");
      car1.printCar();
      
 
   }
}

//public void setCar(int newMotorSize, int newDoors, String newModel, String newLicensePlate) {
