public class Main {
   public static void main(String[] args) {
      
      Menu menu = new Menu();
      
      //create menu items
      menu.createNewMenu("Spaghetti", 25);      
      menu.createNewMenu("Lasagne", 50);      
      menu.createNewMenu("Tortellini", 75);
      
      //update menu item
      //menu.updateMenuItem(1, "Test", 50);
      
      //delete menu item
      //menu.deleteMenuItem(2);
      
      //print/read menu items
      //System.out.println("---------Menu card-------\n" + menu.printFullMenu());
      
      
      //Food orders:  (menu / table number)
      FoodOrder foodorder = new FoodOrder(menu, 1);
      
      //add items to order
      foodorder.addOrderItem(0);
      foodorder.addOrderItem(1);
      foodorder.addOrderItem(1);
      foodorder.addOrderItem(1);
      foodorder.addOrderItem(2);
      
      //delete item 
      foodorder.deleteOrderItem(3);
      
      //print full order
      System.out.println(foodorder.printFullOrder());
      
      //print total cost:
      System.out.println(foodorder.calcTotalCost());
      
      
      //System.out.println(foodorder.foodorderItemList.get(0));
      //System.out.println(foodorder.foodorderItemList.get(1));
      //System.out.println(foodorder.foodorderItemList.get(2));            
      }

}