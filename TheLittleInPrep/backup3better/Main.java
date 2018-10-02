public class Main {
   public static void main(String[] args) {
      
      
// -------------MENU-------------
      Menu menu = new Menu();  

//create menu items
      menu.createNewMenu("Spaghetti", 25);      
      menu.createNewMenu("Lasagne", 50);      
      menu.createNewMenu("Tortellini", 75);
      menu.createNewMenu("Tortellini", 75);
      menu.createNewMenu("Tortellini", 75);
      menu.createNewMenu("Tortellini", 75);
      menu.createNewMenu("Tortellini", 75);
      
//update menu item
      menu.updateMenuItem(1, "Test", 50);
      
//delete menu item
      menu.deleteMenuItem(2);
      
//print/read menu items
      System.out.println("---------Menu card-------\n" + menu.printFullMenu());

      }

}