package myFirstPacket;

public class PasswordCheck {
	
	public static boolean checkPassword(String password){
		
		if (password.length() >= 8) {
			
			if (password.substring(0, 1).matches("\\p{Upper}")) { 
				return true;
				
			}
			else{
				return false;
			}
			
		}
		else{
			return false;
		}
		
	
	}
	

}
