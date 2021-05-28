import business.abstracts.UserService;
import business.concretes.UserCheckManager;
import business.concretes.UserEmailVerifyLinkManager;
import business.concretes.UserEmailVerifyManager;
import business.concretes.UserManager;
import core.GoogleAccountManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Fýrat", "Mikyaz", "firat@gmail.com", "999111");
		User user2 = new User(2, "Mustafa", "Akçakaya", "musti@gmail.com", "888777");
		User user3 = new User(3, "Ali", "Aydýn", "aliydn@gmail.com", "555444");
		
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAccountManagerAdapter());
		userService.add(user1);
		System.out.println("***********************");
		userService.delete(user2);
		System.out.println("***********************");
		userService.update(user3);
		System.out.println("***********************");
		
		
		userService.signIn("firat@gmail.com", "999111");
		System.out.println("***********************");
				
		
		UserCheckManager userCheckManager = new UserCheckManager();
		userCheckManager.login(user2);
		System.out.println("***********************");
		
		
		UserEmailVerifyManager mailVerify = new UserEmailVerifyManager();
		UserEmailVerifyLinkManager linkVerify = new UserEmailVerifyLinkManager();
		mailVerify.isValidEmail(user1);
		System.out.println("***********************");
		linkVerify.isLinkEmail(user1);
		System.out.println("***********************");
				

	}

}
