public class Dice {
   public Dice(){}
   
   //throw dice N times
   public static int throwDice(){
    return (int)(Math.random() * 6) + 1;
}
   
}