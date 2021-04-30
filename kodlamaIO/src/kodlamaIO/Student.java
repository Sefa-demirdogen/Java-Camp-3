package kodlamaIO;

public class Student extends User {
	private String school;
	
	public Student(Instructor instructor) {
		instructor.numberOfStudents += 1;
	}
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
		
	}


	
	

}
