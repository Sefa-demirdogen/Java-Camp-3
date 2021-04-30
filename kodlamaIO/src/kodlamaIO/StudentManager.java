package kodlamaIO;

public class StudentManager extends UserManager {
	
	public void takeCourse(Student student) {
		System.out.println("Kursa kaydoldunuz " + student.getFirstName());
	}
	
	public void completeHomework(Student student) {
		System.out.println("Odeviniz tamamlandi " + student.getFirstName());
	}
}
