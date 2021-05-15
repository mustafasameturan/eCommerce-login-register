package loginRegisterInMemory.core;

import loginRegisterInMemory.business.abstracts.UserService;
import loginRegisterInMemory.business.constants.Messages;
import loginRegisterInMemory.entities.concretes.User;
import loginRegisterInMemory.entities.dtos.LoginDto;

public class GoogleAuthManagerAdapter implements AuthService{
	
	private UserService userService;

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		if (userExists(email) == false) {
			userService.add(email);
		}
		
		else {
			User user = userService.get(email);
			
			LoginDto dto = new LoginDto();
			dto.setEmail(user.geteMail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}
		
	}

	@Override
	public void login(LoginDto loginDto) {
		if (loginDto != null && loginDto.getPassword().equals(loginDto.getPassword())) {
			Messages.login();
		}
		else {
			Messages.loginError();
		}
		
	}
	
	@Override
	public boolean userExists(String email) {
		if(userService.get(email) != null) {
			return true;
		}
		return false;
	}
	
	
}
