package loginRegisterInMemory.core;

import loginRegisterInMemory.microServiceGoogleEmail.GoogleEmailManager;

public class GoogleEmailManagerAdapter implements EmailService{
	private GoogleEmailManager googleEmailManager;

	public GoogleEmailManagerAdapter() {
		googleEmailManager = new GoogleEmailManager();
	}

	@Override
	public void send(String email, String message) {
		googleEmailManager.send(email, message);	
	}
}
