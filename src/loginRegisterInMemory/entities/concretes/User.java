package loginRegisterInMemory.entities.concretes;

import loginRegisterInMemory.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	private boolean isVerify;
	
	public User() {}

	public User(int id, String firstName, String lastName, String eMail, String password, boolean isVerify) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.isVerify = isVerify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getIsVerify() {
		return isVerify;
	}
	
	public void setVerify(boolean isVerify) {
		this.isVerify = isVerify;
	}
	
	

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}
