package neu.edu.csye6200;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UniversityBase implements AbstractSchoolAPI {
	
	private List<AbstractPersonAPI> student=new ArrayList<>();
	private List<AbstractPersonAPI> employee=new  ArrayList<>();
	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		this.employee.add(employee);
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		this.student.add(student);
	}

	@Override
	public String getEmployeesInfo() {
		// TODO Auto-generated method stub
//		System.out.println(employee.get(0));// employee.get(0); // Emloyee e
		System.out.println("--------------------------------------------------");
		return employee.toString();
	}

	@Override
	public void showEmployees() {
		System.out.println("****************************************");
		System.out.println("show employee state");
		System.out.println(employee);
		System.out.println("sort result");
		System.out.println("show employee state sort by ID");
		System.out.println(employee);
		System.out.println("show employee state sort by FirstName");
		System.out.println(employee);
		System.out.println("show employee state sort by LastName");
		System.out.println(employee);
		System.out.println("show employee state sort by Age");
		System.out.println(employee);
		System.out.println("show employee state sort by WAGE");
		System.out.println(employee);
		
	}

	@Override
	public String getStudentsInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showStudents() {
		System.out.println("show student state");
		System.out.println(student);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("sort result");
		System.out.println("show student state sort by ID");
		System.out.println(student);
		System.out.println("show student state sort by FirstName");
		System.out.println(student);
		System.out.println("show student state sort by LastName");
		System.out.println(student);
		System.out.println("show student state sort by Age");
		System.out.println(student);
		System.out.println("show student state sort by GPA");
		System.out.println(student);
		/*******************************/
		
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		// TODO Auto-generated method stub
		Collections.sort(employee, new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getId(), o2.getId());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getId(), o2.getId());
			}} );
//		System.out.println("show student state sort by ID");
//		System.out.println(student);
		/*******************sort student by FirstName*****************************/
		Collections.sort(employee,new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {			
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}});
//		System.out.println("show student state sort by FirstName");
//		System.out.println(student);
		/*******************sort student by LatName*****************************/
   	Collections.sort(employee,new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {			
//				return o1.getLastName().compareTo(o2.getLastName());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}});
//		System.out.println("show student state sort by LastName");
//		System.out.println(student);
//   	/*******************sort student by Age*****************************/
   	Collections.sort(employee, new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getAge(), o2.getAge());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAge(), o2.getAge());
			}} );
//		System.out.println("show student state sort by Age");
//		System.out.println(student);
//		/*******************sort student by GPA*****************************/
		Collections.sort(employee, new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getWage(), o2.getWage());
			}} );
//		System.out.println("show student state sort by GPA");
//		System.out.println(student);
		
		/*******************sort student finish*****************************/
		
	}

	

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		 /*******************sort student*****************************/
		 /*******************sort student by ID*****************************/
		Collections.sort(student, new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getId(), o2.getId());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getId(), o2.getId());
			}} );
//		System.out.println("show student state sort by ID");
//		System.out.println(student);
		/*******************sort student by FirstName*****************************/
		Collections.sort(student,new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {			
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}});
//		System.out.println("show student state sort by FirstName");
//		System.out.println(student);
		/*******************sort student by LatName*****************************/
   	Collections.sort(student,new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {			
//				return o1.getLastName().compareTo(o2.getLastName());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}});
//		System.out.println("show student state sort by LastName");
//		System.out.println(student);
//   	/*******************sort student by Age*****************************/
   	Collections.sort(student, new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getAge(), o2.getAge());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAge(), o2.getAge());
			}} );
//		System.out.println("show student state sort by Age");
//		System.out.println(student);
//		/*******************sort student by GPA*****************************/
		Collections.sort(student, new Comparator<AbstractPersonAPI>() {

//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}

			@Override
			public int compare(AbstractPersonAPI o1, AbstractPersonAPI o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGpa(), o2.getGpa());
			}} );
//		System.out.println("show student state sort by GPA");
//		System.out.println(student);
		
		/*******************sort student finish*****************************/
		
	}

	
}

