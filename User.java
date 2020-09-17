import java.util.Scanner;

public class User {
	
	private String firstName;
	
	private String secondName;
	
	private String password;
	
	private int mailBoxCapacity;
	
	private String email;
	
	private String alternativeEmail;

	
	// User Constructor
	public User(String firstName, String secondName, String alternativeEmail) {
		
		
		this.firstName = firstName;
		this.secondName = secondName;
		this.alternativeEmail = alternativeEmail;
		this.password = this.GeneratePassword();
		this.email = this.GenerateEmail();
		this.mailBoxCapacity = 20;
		
		
		System.out.println("your password is: " + password);
		
	}
	

	
	// * * * * * * * * * * * Setter Methods * * * * * * * * * * * //
	
	public void setMailCapacity(int capacity) {
		
		while(!passwordChecker(this.password)) {
			
			System.out.println("Wrong password, please enter it again");

		}
		
		this.mailBoxCapacity = capacity;
		
	}
	
	public void setAlternativeEmail(String email) {
		
		while(!passwordChecker(this.password)) {
			
			System.out.println("Wrong password, please enter it again");

		}
		
		this.alternativeEmail = email;
		
	}
	
	
	// * * * * * * * * * * * Getter Methods * * * * * * * * * * * //
	
	public int getMailCapacity() {
		
		return this.mailBoxCapacity;
		
	}
	
	
	public String getEmail() {
		
		return this.email;
		
	}
	
	public String getAlternativeEmail() {
		
		return this.alternativeEmail;
		
	}
	
	public String getName() {
		
		return (firstName + secondName);
		
	}
	
	
	
	// * * * * * * * * * * * Generators * * * * * * * * * * * //
	
	
	private String GeneratePassword() {
		
		int passwordLength = 10;
		
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < passwordLength; i++) {
			
			int character = (int)(Math.random()*AlphaNumericString.length());
			builder.append(AlphaNumericString.charAt(character));
			
		}
		
		return builder.toString();
	}
	
	private String GenerateEmail() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(firstName);
		builder.append(".");
		builder.append(secondName);
		builder.append("@company.com");
		
		return builder.toString();
		
	}
	
	
	// * * * * * * * * * * * Password Checker * * * * * * * * * * * //
	
	private boolean passwordChecker(String password) {
		
		Scanner passwordTry = new Scanner(System.in);
		
		System.out.println("Enter Password: ");

		return passwordTry.nextLine().equals(password);
			
	}
	
	

}
