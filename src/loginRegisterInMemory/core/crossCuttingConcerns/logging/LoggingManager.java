package loginRegisterInMemory.core.crossCuttingConcerns.logging;

public class LoggingManager implements LoggingService {

	@Override
	public void log(String message, String email) {
		System.out.println(message + email);
	}
	
}
