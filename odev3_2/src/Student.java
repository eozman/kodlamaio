
public class Student extends User{
	private String address;
	private String cardInfo;
	
	public Student(int id, String fullName, String email, String password, String address, String cardInfo) {
		super(id, fullName, email, password);
		this.address = address;
		this.cardInfo = cardInfo;
	}
public Student() {
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}
}
