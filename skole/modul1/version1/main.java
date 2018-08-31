class Program{
      public static void main(String[] args) {
      Snake snake1 = new Snake();  
      Rabbit rabbit1 = new Rabbit();
      
      while (snake1.positionX != rabbit1.positionX && snake1.positionY != rabbit1.positionY){
         snake1.move(-1,-1);
         rabbit1.move(1, 1);
      }
   }
}

class Rabbit {
   int positionX = 1;
   int positionY = 1;
   void talk() {
      System.out.println("I am the Rabbit my position is; " + positionX + ", " + positionY);
   }
   void move(int newPosX, int newPosY) {
      positionX = positionX + newPosX;
      positionY = positionY + newPosY;
      talk();
   }
}

class Snake {
   int positionX = 9;
   int positionY = 9;
   
   void talk() {
      System.out.println("I am the Snake my position is; " + positionX + ", " + positionY);
   }
   void move(int newPosX, int newPosY) {
      positionX = positionX + newPosX;
      positionY = positionY + newPosY;
      talk();
   }
}