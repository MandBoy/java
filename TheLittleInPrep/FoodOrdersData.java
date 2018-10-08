import java.util.ArrayList;
//Denne klasse skal følge CRUD ift. FoodOrders.
public class FoodOrdersData {
   
   FoodOrderItem foodOrderItem;
   ArrayList<FoodOrders> foodOrders = new ArrayList<FoodOrders>();
   
   
   public FoodOrdersData(FoodOrderItem foodOrderItem){
   this.foodOrderItem = foodOrderItem;
      
   }
   
}