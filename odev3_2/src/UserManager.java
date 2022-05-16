
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFullName() + " adlý " + user.getClassName() + " giris yapti.");
	}
	public void logout(User user) {
		System.out.println(user.getFullName() + " adlý " + user.getClassName() + " cikis yapti.");
	}
	public void signUp(User user) {
		System.out.println(user.getFullName() + " adlý " + user.getClassName() + " kayit yapti.");
	}
    public void update(User user) {
		System.out.println(user.getFullName() + " adlý " + user.getClassName() + " bilgilerini guncelledi.");
    }
}
