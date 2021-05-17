package javaCampInheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1,"Ali","Veli","38383838389","ali@hotmail.com","java","0212 999 99 99");
		Student student1 = new Student(2, "Fatih", "Selim", "66336633666","fs@gmail.com", 333);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);
		instructorManager.AddHomework(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student1);
		studentManager.DoHomework(student1);
	}

}
