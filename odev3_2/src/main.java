
public class main {
	public static void main(String[] args) {
		Student student = new Student(1,"Isım Soyisim","isimsoyisim@example.com","12345","Ankara","Kredi Kart bilgileri");
		Instructor instructor = new Instructor(2,"Engin Demirog","engindemirog@example.com","54321","Java+React");
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		studentManager.signUp(student);
		studentManager.login(student);
		studentManager.logout(student);
		studentManager.update(student);
		studentManager.courseRegister(student);
		
		instructorManager.signUp(instructor);
		instructorManager.login(instructor);
		instructorManager.logout(instructor);
		instructorManager.update(instructor);
		instructorManager.courseAdd(instructor);
	}
}
