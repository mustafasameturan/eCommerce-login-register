package loginRegisterInMemory.business.concretes;

import java.util.List;

import loginRegisterInMemory.business.abstracts.UserService;
import loginRegisterInMemory.business.constants.Messages;
import loginRegisterInMemory.core.EmailService;
import loginRegisterInMemory.core.crossCuttingConcerns.logging.LoggingService;
import loginRegisterInMemory.dataAccess.abstracts.UserDao;
import loginRegisterInMemory.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailService emailService;
	private LoggingService loggingService;
	
	public UserManager(UserDao userDao, EmailService emailService, LoggingService loggingService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
		this.loggingService = loggingService;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		loggingService.log("Logged : ", user.geteMail());
		emailService.send(user.geteMail(), "Kayýt tamamlandý!");
	}
	
	@Override
	public void add(String email) {
		User user = new User();
		user.seteMail(email);
		userDao.add(user);
		loggingService.log("Logged 2 : ", user.geteMail());
		emailService.send(email, "Kayýt tamamlandý!");
		
	}

	@Override
	public void update(User user) {
		if (lengthControl(user)) {
			userDao.update(user);
		}
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getId() + " " + user.geteMail() + " " + user.getFullName());
		}
		return userDao.getAll();
	}

	@Override
	public User get(String email) {
		
		return userDao.get(email);
	}
	
	//Business codes 
	
	public boolean lengthControl(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			return true;
		}
		Messages.lentghError();
		return false;
		
	}

}
