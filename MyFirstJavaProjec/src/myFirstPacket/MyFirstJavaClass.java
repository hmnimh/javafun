package myFirstPacket;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyFirstJavaClass {
	
	public String Name;
	
	
	
	public MyFirstJavaClass(String name){
		
		this.Name = name;
	}
	
	
	public void calculate(double var1, double var2, String operator) {
		double result=77;

		switch (operator) {
		case "+":
			result= var1 + var2;
			System.out.println("Das Ergebnis von "+var1+" plus "+var2+" ist gleich "+MyFirstJavaClass.round(result, 2));
			break;
		case "-":
			result= var1 - var2;
			System.out.println("Das Ergebnis von "+var1+" minus "+var2+" ist gleich "+MyFirstJavaClass.round(result, 2));
			break;
		case "/":
			result= var1 / var2;
			System.out.println("Das Ergebnis von "+var1+" durch "+var2+" ist gleich "+MyFirstJavaClass.round(result, 2));
			break;
		case "*":
			result= var1 * var2;
			System.out.println("Das Ergebnis von "+var1+" mal "+var2+" ist gleich "+MyFirstJavaClass.round(result, 2));
			break;
		case "^":
			result= Math.pow(var1, var2);
			System.out.println("Das Ergebnis von "+var1+" hoch "+var2+" ist gleich "+MyFirstJavaClass.round(result, 2));
			break;
		default:
			System.out.println("Das ist leider kein Rechenoperator: " + operator);
			break;
		}

	}
	
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
}
