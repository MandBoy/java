import java.util.ArrayList;

public class FoodOrder {
   
   //menu
   Menu menu;
   MenuItem menuItem;
    
   //order numbers start from 100
   int tablenumber;
   int ordernumber = 100;
   static int instancecounter = 1;
   
   //array list of MenuItem's;
   ArrayList<MenuItem> foodorderItemList = new ArrayList<MenuItem>();
     
   //order status
   boolean orderOpen = true;
   
   //constructor 
   public FoodOrder(Menu menu, int tablenumber) {
      this.menu = menu;
      this.instancecounter++;
      this.ordernumber = instancecounter;
      this.tablenumber = tablenumber;
   }
  
   public boolean addOrderItem(int menuID){
      if(foodorderItemList.add(menu.menuItemList.get(menuID))){
         return true;
      }
      return false;
   }
   
   public boolean deleteOrderItem(int itemID){
      for (int i = 0; i < foodorderItemList.size(); i++) {
         if (foodorderItemList.get(i).getMenuID() == itemID) {
            foodorderItemList.remove(i);
            return true;
         }
      }
      return false;
   }
   
   public String printFullOrder(){
      String Order = "";
      System.out.println("Orders for table " + this.tablenumber);
      for (int i = 0; i < foodorderItemList.size(); i++) {   
         Order += foodorderItemList.get(i).printMenuItem() + "\n";
      }
      return Order;
   }
   
   public double calcTotalCost(){
      double total = 0;
      for (int i = 0; i < foodorderItemList.size(); i++) {
         total += foodorderItemList.get(i).getPrice();
      }
      return total;
   }
       
}