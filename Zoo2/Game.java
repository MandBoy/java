import java.io.Console;
class Game {

   public static Console console = System.console();

   public static void main(String[] args) {
  
   
   showMainMenu();
   
   }
   
   public static int readInt() {
      try {
         return Integer.parseInt(console.readLine());
      } catch(Exception e) {
         return readInt();
      }
   }
   
   public void showMainMenu() {
	System.out.println("1. New Match");
	System.out.println("2. Exit");

	switch(readInt()) {
		case 1:
			break;
		case 2:
			break;
		default:
			showMainMenu();
			break;
	   }
   }
}