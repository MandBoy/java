class Rabbit {
   int positionX = 0;
   int positionY = 0;
   
   void talk(String rabbitTalk) {
      switch (rabbitTalk) {
         case "snakeIsClose":
         System.out.println("Rabbit:\t Ohh no dont kill me");
         break;
         
         case "rabbitIsDead":
         System.out.println("Rabbit:\t Rabbit is dead");
         break;
         
         case "currentPos":
         System.out.println("Rabbit:\t My position is: " + positionX + ", " + positionY);
         break;         
      }
   }
   
   void move(int newPosX, int newPosY) {
      positionX = positionX + newPosX;
      positionY = positionY + newPosY;
      talk("currentPos");
   }
}