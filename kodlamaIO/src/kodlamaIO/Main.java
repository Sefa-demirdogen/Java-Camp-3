package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Ahmet");
		instructor2.setLastName("Kara");
		
		Student student1 = new Student(instructor1);
		student1.setId(3);
		student1.setFirstName("Sefa");
		student1.setLastName("Demirdogen");
		student1.setSchool("Uludag Universitesi");
		
		
		Student student2 = new Student(instructor2);
		student2.setId(4);
		student2.setFirstName("Ali");
		student2.setLastName("Celik");
		student2.setSchool("Ankara Universitesi");
		
		Student student3 = new Student(instructor1);
		student3.setId(4);
		student3.setFirstName("Veli");
		student3.setLastName("Bakir");
		student3.setSchool("Istanbul Universitesi");
		
		StudentManager studentManager = new StudentManager();
		studentManager.takeCourse(student2);
		studentManager.completeHomework(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse();
		instructorManager.showNumberOfStudents(instructor2);
		instructorManager.showNumberOfStudents(instructor1);
		
		
	}

}
