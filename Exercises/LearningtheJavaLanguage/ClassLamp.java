//Create new classes for each real-world object that you observed at the beginning of this trail. 
//Refer to the Bicycle class if you forget the required syntax.

class Lamp {
      //turned off = false
      //turned on = true
      boolean state = false;
      
      void turnOn (boolean newValue) {
            state = newValue;
      }
      void turnOff (boolean newValue) {
            state = newValue;
      }
      void printStates() {
      System.out.println("State: " + state);
      }
}

class LampDemo {
   public static void main(String[] args) {
   //Opret 2 lampe objekter
   Lamp lamp1 = new Lamp();
   Lamp lamp2 = new Lamp();
   
   //invoke methods på objekter
   lamp1.turnOff(false);
   lamp2.turnOn(true);
   
   //printstates
   lamp1.printStates();
   lamp2.printStates();   
   }
}
