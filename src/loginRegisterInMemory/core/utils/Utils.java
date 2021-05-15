package loginRegisterInMemory.core.utils;

public class Utils {
	public static boolean eMailValidate(String email) {
		if (email.contains("@")) {
			return true;
		}
		
		return false;
	}
}
