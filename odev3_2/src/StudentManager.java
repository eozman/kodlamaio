
public class StudentManager extends UserManager {
    public void courseRegister(Student student) {
		System.out.println(student.getFullName() + " adl� " + student.getClassName() + " kursa kayit oldu.");
    }
}
