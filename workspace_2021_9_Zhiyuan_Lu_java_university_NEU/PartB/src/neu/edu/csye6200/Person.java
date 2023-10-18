package neu.edu.csye6200;

public class Person extends AbstractPersonAPI{
	int id;
	String firstname;
	String lastname;
	int age;
	
	public Person(int id, String firstname, String lastname, int age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "\n"+"]";
	}

/************************************/

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstname;
	}



	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstname = firstname;
	}



	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastname;
	}



	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastname=lastname;
	}



	@Override
	protected double getGpa() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
