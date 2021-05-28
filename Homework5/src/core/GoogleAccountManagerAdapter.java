package core;

import entities.concretes.User;
import googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements GoogleService{

	@Override
	public void checkAccountMail(User user) {
		GoogleAccountManager accountManager = new GoogleAccountManager();
		accountManager.checkGoogleMail(user);
	}
	
}
