package loginRegisterInMemory.dataAccess.abstracts;

import java.util.List;

import loginRegisterInMemory.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(int id);
	User get(String email);
	List<User> getAll();
}
