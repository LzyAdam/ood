package neu.edu.csye6200;

public class Student extends Person {
	


private double gpa;
	

	public Student(int id, String firstname, String lastname, int age, double gpa) {
	super(id, firstname, lastname, age);
	this.gpa = gpa;
}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() +"\n"+ "]";
	}
	
	
}
