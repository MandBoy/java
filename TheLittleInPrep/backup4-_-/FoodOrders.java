import java.util.ArrayList;

public class FoodOrders {
   
   Menu menu;
   ArrayList<MenuItem>menuItemList;
   FoodOrderItem foodOrderItem;
   ArrayList<FoodOrderItem> foodOrdersList = new ArrayList<FoodOrderItem>(); 
   
   //constructor 
   public FoodOrders(Menu menu) {
      this.menu = menu;
      this.menuItemList = menu.menuItemList; 
   }
   public void createNewFoodOrder (int tableNumber) {    
      foodOrderItem = new FoodOrderItem(tableNumber);
   }
   public boolean addItemToFoodOrder(int menuID) {
      for (int i = 0; i < menuItemList.size(); i++){
         if (menuItemList.get(i).getMenuID() == menuID){
            foodOrderItem.addOrderItem(menuItemList.get(i));          
            return true;
         } 
      }
      return false;
   }
   public boolean deleteItemFromFoodOrder(int menuID) {
      for (int i = 0; i < menuItemList.size(); i++) {
         if(menuItemList.get(i).getMenuID() == menuID){
            foodOrderItem.deleteOrderItem(menuItemList.get(i));
            return true;
         }
      }
      return false;
   }   
}