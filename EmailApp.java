import javax.swing.*;

public class EmailApp {
	
	public static void main(String[] args) {
		
		User user1 = new User("Stevie", "Hubble", "stevie-hubble@hotmail.co.uk");
		
		System.out.println(user1.getEmail());
		System.out.println(user1.getAlternativeEmail());
		System.out.println(user1.getMailCapacity());
		

	}

}
