package okul;

public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Aziz");
		student.setLastName("Özsoy");
		student.setEmail("azizozsoy@gmail.com");
		student.setAge(28);
		student.setStudentNo(10001);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@gmail.com");
		instructor.setAge(30);
		instructor.setSalary(10501);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.selectLesson("Java");
		
	}

}
