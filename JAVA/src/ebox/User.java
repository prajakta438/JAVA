package ebox;

public class User {

	private String name;
	private String username;
	private String password;
	private ContactDetail contactDetail;
	public String getName() {
		return name;
	}
	// getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ContactDetail getContactDetail() {
		return contactDetail;
	}
	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}
	
	
	public User() {
		super();
	}
	public User(String name, String username, String password, ContactDetail contactDetail) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.contactDetail = contactDetail;
	}
	@Override
	public String toString() {
		return "Name:" + name +
				"\nUsername:" + username +
				"\nPassword:" + password + 
				"\nContact detail:\n" + contactDetail.toString();
	}
	
	
	
	
	
	
}
