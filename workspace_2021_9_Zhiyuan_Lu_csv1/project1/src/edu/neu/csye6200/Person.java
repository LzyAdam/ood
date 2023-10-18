package edu.neu.csye6200;
/*
 * CVS
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Person {
	private int id;
	private int age;
	private String firstname;
	private String lastname;
	private String parentfirstname;
	private String parentlastname;
	
	public Person(int id, int age, String firstname, String lastname, String parentfirstname, String parentlastname) {
		super();
		this.id = id;
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
		this.parentfirstname = parentfirstname;
		this.parentlastname = parentlastname;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", parentfirstname=" + parentfirstname + ", parentlastname=" + parentlastname + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getParentfirstname() {
		return parentfirstname;
	}

	public void setParentfirstname(String parentfirstname) {
		this.parentfirstname = parentfirstname;
	}

	public String getParentlastname() {
		return parentlastname;
	}

	public void setParentlastname(String parentlastname) {
		this.parentlastname = parentlastname;
	}
	
	
	
}
