package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {
	boolean login(User user);
}
