package business.concretes;

import business.abstracts.UserEmailVerifyService;
import entities.concretes.User;

public class UserEmailVerifyManager implements UserEmailVerifyService{

	@Override
	public boolean isValidEmail(User user) {
		System.out.println(user.getEmail() + " mail adresinize do�rulama maili g�nderilmistir.");
		return false;
	}
}
