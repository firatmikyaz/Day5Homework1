package business.abstracts;

import entities.concretes.User;

public interface UserEmailVerifyLinkService {
	boolean isLinkEmail(User user);
}
