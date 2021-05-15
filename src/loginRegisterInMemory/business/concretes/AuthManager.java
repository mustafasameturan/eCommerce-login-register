package loginRegisterInMemory.business.concretes;

import loginRegisterInMemory.business.abstracts.AuthService;
import loginRegisterInMemory.business.abstracts.UserService;
import loginRegisterInMemory.business.constants.Messages;
import loginRegisterInMemory.entities.concretes.User;
import loginRegisterInMemory.entities.dtos.LoginDto;

public class AuthManager implements AuthService {

	private UserService userService;
	
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		
		if (userValidate(user) && passwordValidate(user.getPassword()) && !userExists(user.geteMail())) {
			userService.add(user);
		}
		else {
			Messages.registerComplete();
		}
		
	}

	@Override
	public void login(LoginDto loginDto) {
		User user = userService.get(loginDto.getEmail());
		
		if(user != null && user.getPassword().equals(loginDto.getPassword())) {
			Messages.login();
		}
		else {
			Messages.loginError();
		}		
	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 15) {
			User existUser = userService.get(user.geteMail());
			existUser.setVerify(true);
			
			userService.update(existUser);
			
			Messages.eMailVerified();
		}
		
		Messages.eMailNotVerified();
		
	}

	@Override
	public boolean userExists(String email) {
		if (userService.get(email) == null) {
			return false;
		}
		
		Messages.userExist();
		return true;
	}
	
	//business codes
	
	public boolean userValidate(User user) {
		
		if (user != null 
				&& !user.getFirstName().isEmpty() 
				&& !user.getLastName().isEmpty()
				&& !user.geteMail().isEmpty()
				&& !user.getPassword().isEmpty()) {
			return true;
		}
		
		Messages.userValidate();
		return false;
	}
	
	public boolean passwordValidate(String password) {
		if (password.length() >= 6) {
			return true;
		}
		
		Messages.passwordValidate();
		return false;
	}
	
	
	
	
}
