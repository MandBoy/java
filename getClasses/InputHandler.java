import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHandler {
   BufferedReader reader;
	InputStreamReader stream;
   
   //constructor 
   public InputHandler(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
	}
   
   public double readDouble() {
		try {
			return Double.parseDouble(reader.readLine());
		} catch(Exception e) {
			System.out.println("Input must be an double, try again.");
			return readDouble();
		}
	}
   
	public String readString() {
		String input;

		try {
			input = reader.readLine();
		} catch(Exception e) {
			input = "ERROR";
		}

		return input;
	}
}
