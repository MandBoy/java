import java.io.Console;
public class Input {
    Console console = System.console();
    
    private int var1;
    private String var2;
    private int var3;
    
        
    public void setVar1(int var) { 
    this.var1 = var; 
    } 
    public int getVar1() {
    return this.var1; 
    }
    public void setVar3(int var) { 
    this.var3 = var; 
    } 
    public int getVar3() { 
    return this.var3; 
    }

/*   
   public int getPosX() { return this.posX; }
   public void setPosX(int posX){ this.posX = posX; }
*/
}

/*
   public void input() {
        // declares an array of integers
         
         String[] vars;
         vars = new String[3];

        // allocates memory for 10 integers
        vars[0] = console.readLine();
   }
}

*/