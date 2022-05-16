
public class StudentManager extends UserManager {
    public void courseRegister(Student student) {
		System.out.println(student.getFullName() + " adlı " + student.getClassName() + " kursa kayit oldu.");
    }
}
