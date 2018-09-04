class Program {
   public static void main(String[] args){
      Rabbit rabbit1 = new Rabbit();
      Snake snake1 = new Snake();
     
      while (snake1.positionX != rabbit1.positionX && snake1.positionY != rabbit1.positionY) {
         snake1.move(-1,-1);
         rabbit1.move(1, 1);
         
         if (snake1.positionX - rabbit1.positionX == 2 && snake1.positionY - rabbit1.positionY == 2) {
            rabbit1.talk("snakeIsClose");
         }
      }
      rabbit1.talk("rabbitIsDead");
      snake1.talk();
   }
}