
public class Instructor extends User {
	private String profession;
	
	public Instructor() {
		
	}
	public Instructor(int id, String fullName, String email, String password,  String profession) {
		super(id, fullName, email, password);
		this.profession = profession;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
}
