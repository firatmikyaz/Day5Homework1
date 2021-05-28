package business.concretes;

import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public GoogleService getGoogleService() {
		return googleService;
	}

	public void setGoogleService(GoogleService googleService) {
		this.googleService = googleService;
	}

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý sisteme eklendi : " + user.getFirstName());
		this.googleService.checkAccountMail(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý sistemden silindi: " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý sistemde güncellendi: " + user.getFirstName());
		
	}

	@Override
	public void signIn(String email, String password) {
		for(User user:userDao.getAll()) {
			if(email == user.getEmail() && password == user.getPassword()) {
				System.out.println("Login successful");
				return;
			}
			System.out.println("Wrong entry. Try again.");
		}
	}

}
