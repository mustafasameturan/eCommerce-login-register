package loginRegisterInMemory.core;

import loginRegisterInMemory.entities.dtos.LoginDto;

public interface AuthService {
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto loginDto);
}
