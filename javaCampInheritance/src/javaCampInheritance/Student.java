package javaCampInheritance;

public class Student extends User {

	public int studentNumber;


	public Student(int id, String firstName, String lastName, String nationalityIdentity,String email, int studentNumber) {
		super(id, firstName, lastName, nationalityIdentity,email);
		this.studentNumber = studentNumber;
	}
	
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
