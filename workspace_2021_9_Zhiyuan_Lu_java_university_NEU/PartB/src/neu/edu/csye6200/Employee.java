package neu.edu.csye6200;

public class Employee extends Person {
	



	public Employee(int id, String firstname, String lastname, int age, double wage) {
		super(id, firstname, lastname, age);
		this.wage = wage;
	}



	double wage;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	

	@Override
	public String toString() {
		return "Employee [wage=" + wage + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() +"\n"+ "]";
	}
	
}
