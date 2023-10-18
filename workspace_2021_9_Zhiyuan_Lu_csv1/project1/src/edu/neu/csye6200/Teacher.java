package edu.neu.csye6200;

public class Teacher extends Person {
	private double hourlyWage;

	public Teacher(int id, int age, String firstname, String lastname, String parentfirstname, String parentlastname,
			double hourlyWage) {
		super(id, age, firstname, lastname, parentfirstname, parentlastname);
		this.hourlyWage = hourlyWage;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
//	public String toString() {
//		return "Teacher [hourlyWage=" + hourlyWage + "]";
//	}
	public String toString() {
		return "Teacher [ getId()=" + getId() + ", getAge()=" + getAge()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getParentfirstname()="
				+ getParentfirstname() + ", getParentlastname()=" + getParentlastname() + "hourlyWage=" + hourlyWage +  "]"+"\n";
	}
	
}
