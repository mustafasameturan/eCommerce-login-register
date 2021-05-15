package loginRegisterInMemory.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import loginRegisterInMemory.dataAccess.abstracts.UserDao;
import loginRegisterInMemory.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	
	public InMemoryUserDao() {
		super();
		User user1 = new User(1,"Mustafa Samet","Turan","mst@hotmail.com","12345",true);
		User user2 = new User(2,"Yaðmur Buse","Turan","ybk@hotmail.com","1234567",true);
		
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {
		System.out.println("Logged in memory " + user.geteMail());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		
		User userToUpdate = users.stream()
				.filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		
		userToUpdate.seteMail(user.geteMail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.getIsVerify());
	}

	@Override
	public void delete(int id) {
		User userToDelete = users.stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.orElse(null);
		
		users.remove(userToDelete);
	}

	@Override
	public User get(String email) {
		User user = users.stream()
				.filter(u -> u.geteMail() == email)
				.findFirst()
				.orElse(null);
		return user;
	}
	
	@Override
	public List<User> getAll() {
		
		return users;
	}
}
