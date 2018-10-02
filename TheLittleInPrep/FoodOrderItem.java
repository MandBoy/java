import java.util.ArrayList;
public class FoodOrderItem {
   
   boolean orderOpen = true; //order status
   int tableNumber;
   int orderNumber = 100;
   static int instanceCounter = 1;
   double totalCost;
   
   ArrayList<MenuItem> orderMenuItemList = new ArrayList<MenuItem>();
       
//constructor / create instance of order    
   public FoodOrderItem (int tableNumber) { 
      this.tableNumber = tableNumber;
      this.instanceCounter++;
      this.orderNumber = instanceCounter;
   }
   
//set
   public void setOrderOpen(boolean orderOpen){ this.orderOpen = orderOpen; }
   public void setTableNumer(int tableNumber) { this.tableNumber = tableNumber; }
//get
   public boolean getOrderOpen() {  return this.orderOpen;   }
   public int getOrderNumber()   {  return this.orderNumber; } 
   public double getTotalCost()  {  return this.totalCost;   }
   public int getTableNumber()   {  return this.tableNumber; }
   public ArrayList getOrderMenuItemList() {  return this.orderMenuItemList; }

   public String printOrder(){
      String Order = "";
      System.out.println("Orders for table " + this.tableNumber);
      for (int i = 0; i < orderMenuItemList.size(); i++) {   
         Order += orderMenuItemList.get(i).printMenuItem() + "\n";
      }
      return Order;
   }  
}