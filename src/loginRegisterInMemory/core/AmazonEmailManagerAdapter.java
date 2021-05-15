package loginRegisterInMemory.core;

import loginRegisterInMemory.microServiceAmazonEmail.AmazonEmailManager;

public class AmazonEmailManagerAdapter implements EmailService{
	
	private AmazonEmailManager amazonEmailManager;

	public AmazonEmailManagerAdapter() {
		super();
		amazonEmailManager = new AmazonEmailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonEmailManager.send(email, message);
		
	}
	
}
