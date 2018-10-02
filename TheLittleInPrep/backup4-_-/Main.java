public class Main {
   public static void main(String[] args) {
      
      Menu menu;
// -------------MENU-------------
      menu = new Menu();  

//create menu items
      menu.createNewMenu("Spaghetti", 80);      
      menu.createNewMenu("Lasagne", 65);      
      menu.createNewMenu("Tortellini", 75);
      menu.createNewMenu("Pizza", 75);
      menu.createNewMenu("Coca cola", 25);
      menu.createNewMenu("Fanta", 25);
      menu.createNewMenu("Sprite", 25);
      
//update menu item
      //menu.updateMenuItem(1, "Test", 50);
      
//delete menu item
      //menu.deleteMenuItem(2);
      
//print/read menu items
      System.out.println("---------Menu card-------\n" + menu.printFullMenu());
      
      
//FoodOrders      
      FoodOrders foodOrders = new FoodOrders(menu);
   
    
      foodOrders.addItemToFoodOrder(1);
      foodOrders.addItemToFoodOrder(3);
      foodOrders.addItemToFoodOrder(5);
      foodOrders.addItemToFoodOrder(3);
      
      }
         
     
}