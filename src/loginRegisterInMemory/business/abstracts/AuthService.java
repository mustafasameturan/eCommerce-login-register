package loginRegisterInMemory.business.abstracts;

import loginRegisterInMemory.entities.concretes.User;
import loginRegisterInMemory.entities.dtos.LoginDto;

public interface AuthService {
	void register(User user);
	void login(LoginDto loginDto);
	boolean userExists(String email);
	void verify(User user, String token);
}
