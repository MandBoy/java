public class MenuItem {
//MenuItem attributes
   int menuID = 0;
   static int instancecounter = 0;
   String menuItemName;
   int price;
   
//constructor nothing set
   public MenuItem(){
      this.menuID = 0;
      this.menuItemName = "not set";
      this.price = 0; 
      
   }
//constructor set
   public MenuItem(String menuItemName, int price){
      this.menuItemName = menuItemName;
      this.price = price;
      this.instancecounter++;
      this.menuID = instancecounter;
   }
//get  
   public int getMenuID(){ return this.menuID; }
   public int getPrice() { return this.price; }
//set
   public void setMenuID(int menuID){
      this.menuID = menuID;
   } 
//update Menu
   public void updateMenuItem(int menuID, String menuItemName, int price) {
      this.menuItemName = menuItemName;
      this.price = price;
      this.menuID = menuID;
   }
//return String menu
   public String printMenuItem(){
     return "Menu ID: " + this.menuID + " Menu: " + this.menuItemName + " Price: " + this.price; 
   }  
}