package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean login(User user) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(user.getEmail());
	     
	    List<String> emailList= new ArrayList<String>();
	     
		if (user.getFirstName().length()<2) {
			System.out.println("Kullan�c� isminiz 2 karakterden k���k olamaz.Tekrar Deneyiniz!");
			return true;
		}
		if (user.getLastName().length()<2) {
			System.out.println("Kullan�c� soyad�n�z 2 karakterden k���k olamaz.Tekrar Deneyiniz!");
			return true;
		}
		if (user.getPassword().length()<6) {
			System.out.println("Parolan�z 6 karakterden k���k olamaz.Tekrar Deneyiniz!");
			return true;
		}
		if(emailList.contains(user.getEmail())  ) {
			
			System.out.println("Email adresi tekrarlanmaktad�r,ba�ka bir email se�iniz.");
			return true;			
		}
		if(matcher.matches() != true) {
			   System.out.println("Ge�ersiz e-posta adresi, ge�erli e-posta adresi giriniz.");
	            return true;
	        } else {
		            System.out.println("Sisteme kay�t oldunuz.");
		            return false;
	        }
	}
	
}
