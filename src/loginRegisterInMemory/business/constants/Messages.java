package loginRegisterInMemory.business.constants;

public class Messages {
	public static void userExist() {
		System.out.println("Kullanýcý sistemde kayýtlý!");
	}
	
	public static void userValidate() {
		System.out.println("Kayýt sýrasýnda boþ alan býrakmadýðýnýzdan emin olunuz!");
	}
	
	public static void passwordValidate() {
		System.out.println("Þifreniz 6 karakterden fazla olmalýdýr!");
	}
	
	public static void login() {
		System.out.println("Baþarýyla sisteme giriþ yaptýnýz!");
	}
	
	public static void loginError() {
		System.out.println("E-Posta veya þifreniz yanlýþ!");
	}
	
	public static void registerComplete() {
		System.out.println("Kayýt tamamlandý!");
	}
	
	public static void eMailVerified() {
		System.out.println("E-Mail doðrulandý!");
	}
	
	public static void eMailNotVerified() {
		System.out.println("E-Mail doðrulanamadý!");
	}
	
	public static void lentghError() {
		System.out.println("Adýný ve soyadýnýz minimum iki karakter olmalýdýr!");
	}
}
