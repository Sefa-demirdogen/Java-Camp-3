package kodlamaIO;

public class InstructorManager extends UserManager {
	public void openCourse() {
		System.out.println("Yeni bir kurs actiniz");
	}
	public void giveHomework() {
		System.out.println("Odev verildi");
	}
	public void showNumberOfStudents(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Hocanýn ogrenci sayisi: " + instructor.numberOfStudents);
	}
	
}
