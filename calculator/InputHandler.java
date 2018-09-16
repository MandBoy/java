import java.io.Console;
public class InputHandler {
    Console console = System.console();
    
    private double var1;
    private double var2;
    private enum operators { ADD, SUBTRACT, MULTIPLY, DIVIDE; }
    
        
    public void setVar1(double var) { this.var1 = var; } 
    public double getVar1() { return this.var1; }
    public void setVar2(double var) { this.var2 = var;  } 
    public double getVar2() { return this.var2; }
    
    

}
