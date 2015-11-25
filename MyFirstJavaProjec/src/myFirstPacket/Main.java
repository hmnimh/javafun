package myFirstPacket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static BufferedReader reader;
	
	public static void main(String[] args) throws IOException {

		double var1 = 0;
		double var2 = 0;
		
		Calculator hugo = new Calculator(Main.getInput("Bitte gib einen Objektnamen ein: "));
			
		System.out.println("Hallo, mein Name ist "+hugo.getName());
		System.out.println("Ich bin ein Objekt der Klasse "+Calculator.getKlasse());
		
		try {
			var1 = Double.parseDouble(Main.getInput("Gib eine Zahl ein: "));
		} catch (Exception e) {
			System.out.println("Das ist keine Zahl :( ");

		}
		
		try {
			var2 = Double.parseDouble(Main.getInput("Gib eine zweite Zahl ein: "));
		} catch (Exception e) {
			System.out.println("Das ist keine Zahl :( ");
		}
		
		String oper = Main.getInput("Gib ein Rechnezeichen ein: ");
		
		hugo.calculate(var1, var2, oper);
		
		if(reader != null){
		reader.close();
		}
		
	}
	
	
	public static String getInput(String text) throws IOException{
		
		reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print(text);
		  
		return reader.readLine();	
	}
	

}
