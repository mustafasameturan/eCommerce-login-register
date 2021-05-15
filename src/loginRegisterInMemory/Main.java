package loginRegisterInMemory;


import loginRegisterInMemory.business.concretes.AuthManager;
import loginRegisterInMemory.business.concretes.UserManager;
import loginRegisterInMemory.core.AmazonEmailManagerAdapter;
import loginRegisterInMemory.core.GoogleEmailManagerAdapter;
import loginRegisterInMemory.core.crossCuttingConcerns.logging.LoggingManager;
import loginRegisterInMemory.dataAccess.concretes.InMemoryUserDao;
import loginRegisterInMemory.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user3 = new User(3,"Ecrin","Turan","ecrin@hotmail.com","123456",true);
		User user4 = new User(4,"Fatih","Uysal","fatih@hotmail.com","32423423",false);
		User user5 = new User(5,"Fatih","Uysal","sdasds@hotmail.com","32423423",false);
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		LoggingManager loggingManager = new LoggingManager();
		GoogleEmailManagerAdapter googleEmailManagerAdapter = new GoogleEmailManagerAdapter();
		AmazonEmailManagerAdapter amazonEmailManagerAdapter = new AmazonEmailManagerAdapter();
		
		AuthManager authManager = new AuthManager(new UserManager(inMemoryUserDao, googleEmailManagerAdapter, loggingManager));
		authManager.register(user3);
		//authManager.register(user4);
		
		UserManager userManager = new UserManager(inMemoryUserDao, amazonEmailManagerAdapter, loggingManager);
		userManager.getAll();
		
	}

}
