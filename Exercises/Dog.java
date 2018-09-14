public class Dog {
   private String name;
   private String foedselsdato;
   
   //konstruktør
   public Dog() {
      name = "";
      foedselsdato = "1 april 2017";
   }
   
   //get / set
   public void setName(String name){this.name = name; }
   public String getName(){ return this.name; }
   public void setFoedselsdato(String foedselsdato){ this.foedselsdato = foedselsdato; }
   public String getFoedselsdato(){ return this.foedselsdato; }
   
   //øvrige metoder
   
   public void goe() {
    System.out.println("vov");
   }
   
   public boolean logre() {
      return true;
   }
}