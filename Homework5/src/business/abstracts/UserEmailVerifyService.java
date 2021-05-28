package business.abstracts;

import entities.concretes.User;

public interface UserEmailVerifyService {
	boolean isValidEmail(User user);
}
