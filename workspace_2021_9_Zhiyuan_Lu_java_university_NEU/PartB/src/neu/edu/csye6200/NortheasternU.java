package neu.edu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NortheasternU extends UniversityBase implements AbstractSchoolAPI{
 public static void demo(){
 /*******************instantiate student*****************************/
		//List<Student> student = new ArrayList<>();
		
		
		NortheasternU neu = new NortheasternU();
		 neu.addStudent(new Student(10006,"Tom","Ford",22,3.5));
		 neu.addStudent(new Student(10005,"Adam","Smith",25,3.0));
		 neu.addStudent(new Student(10004,"Chris","Johnson",21,3.4));
		 neu.showStudents();
		 
		 neu.sortStudents(null);
		 neu.show();
		 
		 NortheasternU neu1 = new NortheasternU();
		 neu1.addEmployee(new Employee(20007,"David","Backer",32,35));
		 neu1.addEmployee(new Employee(20008,"Toms","Fords",39,57));
		 neu1.addEmployee(new Employee(20006,"Adam","Tomas",36,55));
		 neu1.showEmployees();
		 //System.out.print(neu.getEmployeesInfo());
		 
		// employee.add(new Employee(20008,"Toms","Fords",39,57));
		//	employee.add(new Employee(20006,"Adam","Tomas",36,55));
		//neu.addStudent(10006,"Tom","Ford",22,3.5);
		
		//student.add(new Student(10006,"Tom","Ford",22,3.5));
		//student.add(new Student(10005,"Adam","Smith",25,3.0));
		//student.add(new Student(10004,"Chris","Johnson",21,3.4));
///*******************show student state*****************************/
//		System.out.println("show student state");
//		System.out.println(student);
// /*******************sort student*****************************/
//		 /*******************sort student by ID*****************************/
//		Collections.sort(student, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getId(), o2.getId());
//			}} );
//		System.out.println("show student state sort by ID");
//		System.out.println(student);
//		/*******************sort student by FirstName*****************************/
//		Collections.sort(student,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {			
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}});
//		System.out.println("show student state sort by FirstName");
//    	System.out.println(student);
//		/*******************sort student by LatName*****************************/
//    	Collections.sort(student,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {			
//				return o1.getLastName().compareTo(o2.getLastName());
//			}});
//		System.out.println("show student state sort by LastName");
//    	System.out.println(student);
//    	/*******************sort student by Age*****************************/
//    	Collections.sort(student, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getAge(), o2.getAge());
//			}} );
//		System.out.println("show student state sort by Age");
//		System.out.println(student);
//		/*******************sort student by GPA*****************************/
//		Collections.sort(student, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}} );
//		System.out.println("show student state sort by GPA");
//		System.out.println(student);
//		
		/*******************sort student finish*****************************/
		System.out.println("******************************************************");
		 /*******************instantiate employee*****************************/
		
//		List<Employee>employee=new  ArrayList<>();
//		employee.add(new Employee(20007,"David","Backer",32,35));
//		employee.add(new Employee(20008,"Toms","Fords",39,57));
//		employee.add(new Employee(20006,"Adam","Tomas",36,55));
//		System.out.println("show employee state");
//		System.out.println(employee);
		
		/*******************sort employee*****************************/
		 /*******************sort employee by ID*****************************/
//		Collections.sort(employee, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getId(), o2.getId());
//			}} );
//		System.out.println("show Employee state sort by ID");
//		System.out.println(employee);
//		/*******************sort Employee by FirstName*****************************/
//		Collections.sort(employee,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {			
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}});
//		System.out.println("show Employee state sort by FirstName");
//   	System.out.println(employee);
//		/*******************sort Employee by LatName*****************************/
//   	Collections.sort(employee,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {			
//				return o1.getLastName().compareTo(o2.getLastName());
//			}});
//		System.out.println("show Employee state sort by LastName");
//   	System.out.println(employee);
//   	/*******************sort Employee by Age*****************************/
//   	Collections.sort(employee, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getAge(), o2.getAge());
//			}} );
//		System.out.println("show Employee state sort by Age");
//		System.out.println(employee);
//		/*******************sort Employee by GPA*****************************/
//		Collections.sort(employee, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return Double.compare(o1.getWage(), o2.getWage());
//			}} );
//		System.out.println("show Employee state sort by Wage");
//		System.out.println(employee);
//		
		/*******************sort Employee finish*****************************/
		System.out.println("******************************************************");
	
}
	}
