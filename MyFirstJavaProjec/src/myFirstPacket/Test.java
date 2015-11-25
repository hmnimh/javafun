package myFirstPacket;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		String password = Main.getInput("Passwort: ");
		
		if (password.substring(0, 1).matches("\\p{Upper}")) {  
			System.out.println("Match!");
		}
		else{
			System.out.println("No Match!");
		}
		
		

	}

}
