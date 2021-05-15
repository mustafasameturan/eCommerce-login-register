package loginRegisterInMemory.business.constants;

public class Messages {
	public static void userExist() {
		System.out.println("Kullan�c� sistemde kay�tl�!");
	}
	
	public static void userValidate() {
		System.out.println("Kay�t s�ras�nda bo� alan b�rakmad���n�zdan emin olunuz!");
	}
	
	public static void passwordValidate() {
		System.out.println("�ifreniz 6 karakterden fazla olmal�d�r!");
	}
	
	public static void login() {
		System.out.println("Ba�ar�yla sisteme giri� yapt�n�z!");
	}
	
	public static void loginError() {
		System.out.println("E-Posta veya �ifreniz yanl��!");
	}
	
	public static void registerComplete() {
		System.out.println("Kay�t tamamland�!");
	}
	
	public static void eMailVerified() {
		System.out.println("E-Mail do�ruland�!");
	}
	
	public static void eMailNotVerified() {
		System.out.println("E-Mail do�rulanamad�!");
	}
	
	public static void lentghError() {
		System.out.println("Ad�n� ve soyad�n�z minimum iki karakter olmal�d�r!");
	}
}
