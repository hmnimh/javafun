package myFirstPacket;

import java.io.IOException;

public class Login {

	public static void main(String[] args) throws IOException {


		String password = Main.getInput("Gib ein Passwort ein: ");
		
		if(PasswordCheck.checkPassword(password)){
			System.out.println("Dein Passwort entspricht den Richtlinien.");
		}
		else{
			System.out.println("Dein Passwort entspricht leider nicht den Richtlinien.");
		}
		
		
	}

}
