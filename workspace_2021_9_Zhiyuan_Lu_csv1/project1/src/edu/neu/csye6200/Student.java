package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person  {
	private int studentid;
	private double gpa;
	public Student(int id, int age, String firstname, String lastname, String parentfirstname, String parentlastname,
			int studentid, double gpa) {
		super(id, age, firstname, lastname, parentfirstname, parentlastname);
		this.studentid = studentid;
		this.gpa = gpa;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", gpa=" + gpa + ", getId()=" + getId() + ", getAge()=" + getAge()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getParentfirstname()="
				+ getParentfirstname() + ", getParentlastname()=" + getParentlastname() +  "]"+"\n";
	}
	
	public static int compareByID(Student s1, Student s2) {
		return s1.getId()-s2.getId();
	}
	/***********************parsing student*********************/
	public List<Student> readStudentItems() throws IOException {
		List<Student> students=new ArrayList<>();
		
		try(BufferedReader inLine=new BufferedReader(new FileReader(new File("students.txt")));
	){	String inputLine=null;
		while((inputLine=inLine.readLine())!=null) {
			String[] fields=inputLine.split(",");
			int id=0;
			int age=0;

			int studentid=0;
			double gpa=0.0;
			try {
				id = Integer.parseInt(fields[0]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[0] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}
			try {
				age = Integer.parseInt(fields[1]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[1] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}
			String firstName = fields[2];
			String lastName = fields[3];
			String parentFirstName = fields[4];
			String parentLastName = fields[5];
			try {
				studentid = Integer.parseInt(fields[6]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[6] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}
			try {
				gpa = Double.parseDouble(fields[7]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[7] + "'" + " is INVALID String representation of double vlaue.");
				e.printStackTrace();
			}
			
			students.add(new Student(id,age,firstName,lastName,parentFirstName,parentLastName,studentid,gpa));
//			Collections.sort(students,new CompareAge());
//	     	System.out.println(students);
			
		}	
			
		}
		return students;
		}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.getFirstname().compareTo(o.getFirstname());
//	}
//	
	
}
