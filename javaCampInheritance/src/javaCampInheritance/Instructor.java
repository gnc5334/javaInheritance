package javaCampInheritance;

public class Instructor extends User {

	private String branch;
	private String officeNumber;
	
	public Instructor(int id, String firstName, String lastName, String nationalityIdentity, String email, String branch,
			String officeNumber) {
		super(id, firstName, lastName, nationalityIdentity, email);
		this.branch = branch;
		this.officeNumber = officeNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	
}
