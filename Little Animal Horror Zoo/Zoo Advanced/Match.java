class Match {
    
      Rabbit rabbit = new Rabbit(0,0);
      Snake snake = new Snake(10,10);
    
      int boardSizeX;
      int boardSizeY;
      
      int maxMoves = 10;
      
      public void startMatch() 
      {
         do {
            rabbit.move("up");
            rabbit.move("right");
            snake.move("down");
            snake.move("left");
            snake.speakPosition();
            rabbit.speakPosition();
            if (snake.getPosX() - rabbit.getPosX() == 2 && snake.getPosY() - rabbit.getPosY() == 2){
               rabbit.beg();            
            }
            
         
         }while (snake.getPosX() != rabbit.getPosX() && snake.getPosY() != rabbit.getPosY());
         snake.eat();
      }
   
}