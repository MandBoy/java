import java.util.ArrayList;
public class FoodOrderItem {
   
   boolean orderOpen = true; //order status
   int tableNumber;
   int orderNumber = 100;
   static int instanceCounter = 1;
   double totalCost;
   
   ArrayList<MenuItem> foodOrderItemList = new ArrayList<MenuItem>(); //array list of MenuItem's;
       
//constructor / create instance of order    
   public FoodOrderItem (int tableNumber) { 
      this.tableNumber = tableNumber;
      this.instanceCounter++;
      this.orderNumber = instanceCounter;
   }
   
//set
   public void setOrderOpen(boolean orderOpen){ this.orderOpen = orderOpen; }
   //public void setFoodOrderItemList(ArrayList foodOrderItemList){ this.foodOrderItemList = foodOrderItemList; }
//get
   public boolean getOrderOpen() {  return this.orderOpen;   }
   public int getOrderNumber()   {  return this.orderNumber; } 
   public double getTotalCost()  {  return this.totalCost;   }
   //public ArrayList getFoodOrderItemList(){ return this.foodOrderItemList; }
   
   public boolean addOrderItem(MenuItem menuItem){
      if(foodOrderItemList.add(menuItem)){
         this.totalCost += menuItem.getPrice();
         return true;
      }
      return false;
   }  
   public boolean deleteOrderItem(MenuItem menuItem){
      for (int i = 0; i < foodOrderItemList.size(); i++){
         if (foodOrderItemList.get(i) == menuItem) {           
            totalCost -= menuItem.getPrice();
            foodOrderItemList.remove(i);
            return true;
         }   
      }
      return false;
   }

   public String printOrder(){
      String Order = "";
      System.out.println("Orders for table " + this.tableNumber);
      for (int i = 0; i < foodOrderItemList.size(); i++) {   
         Order += foodOrderItemList.get(i).printMenuItem() + "\n";
      }
      return Order;
   }  
}