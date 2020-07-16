package chapter2;

public class User {

	private String email;
	private String encryptedPassword;
	private String firstName;
	
	public String getEmail() {
		return email;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
