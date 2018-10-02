import java.util.ArrayList;

public class Menu {
   //opret array list for MenuItems klasen
   ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
   
   //constructer nothing set
   public Menu () { }
   
   public void createNewMenu(String foodItem, int price){
      //create new item
      MenuItem menuItem = new MenuItem(foodItem, price);     
      //add to menu
      menuItemList.add(menuItem);
   }
   public String printFullMenu(){
      String Menu = "";
      for (int i = 0; i < menuItemList.size(); i++){           
         Menu += menuItemList.get(i).printMenuItem() + "\n";
      }
      return Menu;
   } 
   public boolean updateMenuItem(int menuID, String menuItemName, int price) {
      MenuItem menuItem = new MenuItem(menuID, menuItemName, price); 
      for (int i = 0; i < menuItemList.size(); i++){
         if(menuItemList.get(i).getMenuID() == menuID) {
            menuItemList.set(i, menuItem);
            return true;  
         }
      }
      return false;      
   }
   public boolean deleteMenuItem(int id){
      for (int i = 0; i < menuItemList.size(); i++) {
         if(menuItemList.get(i).getMenuID() == id) {
            menuItemList.remove(i);
            return true;
         }
      }
      return false;
   }
}