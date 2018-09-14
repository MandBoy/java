public class CarBrooker
{

   public static void main(String[] args)
   {
      //lav en ny bil med konstruktør1
      Car car1 = new Car();
      car1.printCar();
      //lav en ny bil med konstruktør2
      Car car2 = new Car(3, 5, "Audi", "AA 27 560");
      car2.printCar();
      
      //Ændre model på Car2
      car2.setModel("Tesla");
      car2.printCar();
 
   }
}

//public void setCar(int newMotorSize, int newDoors, String newModel, String newLicensePlate) {
