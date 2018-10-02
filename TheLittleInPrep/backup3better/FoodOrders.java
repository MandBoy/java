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
   public void addItemToFoodOrder(int menuID) {    
      for (int i = 0; i < menuItemList.size(); i++){
         if (menuItemList.get(i).getMenuID() == menuID){
            foodOrderItem.addOrderItem(menuItemList.get(i));     
         } 
      }
   }
   public void saveFoodOrder(FoodOrderItem foodOrderItem) {
      foodOrdersList.add(foodOrderItem);
   }
   
   
}