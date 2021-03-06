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
//constructor on instantiation
   public MenuItem(String menuItemName, int price){
      this.menuItemName = menuItemName;
      this.price = price;
      this.instancecounter++;
      this.menuID = instancecounter;
   }
//constructor on update
   public MenuItem(int menuID, String menuItemName, int price) {
      this.menuItemName = menuItemName;
      this.price = price;
      this.menuID = menuID;
   }
//get  
   public int getMenuID()           { return this.menuID; }
   public String getMenuItemName()  { return this.menuItemName; }
   public int getPrice()            { return this.price; }
//set
   public void setMenuID(int menuID){ this.menuID = menuID; }
   public void setMenuItemName(String menuItemName) { this.menuItemName = menuItemName; }
   
//return String menu
   public String printMenuItem(){
     return "Menu ID: " + this.menuID + " Menu: " + this.menuItemName + " Price: " + this.price; 
   }  
}