import java.util.ArrayList;

public class FoodOrderHandler {
   
   Menu                    menu;
   ArrayList<MenuItem>     menuItemList;
   FoodOrderItem           foodOrderItem;
   
   //constructor 
   public FoodOrderHandler(Menu menu) {
      this.menu = menu;
      this.menuItemList = menu.menuItemList; 
   }
}