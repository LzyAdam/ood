package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;







class FileUtil{
	/******************************Student read&write*****************/
	public void writeStudentItems() throws IOException {
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {bw = new BufferedWriter(new FileWriter(new File("students.txt")));
			//br = new BufferedReader(new FileReader(new File("teacher.txt")));
			
		
			String[] student={"10001,19,Adam,Smith,Bob,Smith,20001,3.1",
					"10005,18,David,Frank,Chris,Frank,20005,3.0",
					"10002,17,Chris,White,Bob,White,20002,3.7",
					"10000,20,Bobby,Black,David,Black,20000,3.2"};
			
			for(String stu:student) {
				bw.write(stu);
				bw.newLine();
				}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bw!=null) {
				bw.close();
			}
			if(br!=null) {
				br.close();
				}
			}
	
		
		
	}
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
//		Collections.sort(students,new CompareAge());
//     	System.out.println(students);
		
	}	
		
	}
	return students;
	}
/******************************Teacher read&write*****************/
	public void writeTeacherItems() throws IOException{
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			bw = new BufferedWriter(new FileWriter(new File("teacher.txt")));
			String[] teacher = { "10001,18,Adams,Smith,Bobby,Smith,160" };
			
			for (String tea : teacher) {
				bw.write(tea);
				bw.newLine();
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				bw.close();
			}
			if(br!=null) {
				br.close();
				}
			}
	}

	public List<Teacher> readTeacherItems() throws IOException {
		List<Teacher> teacher=new ArrayList<>();
		
		try(BufferedReader inLine=new BufferedReader(new FileReader(new File("teacher.txt")));
	){	String inputLine=null;
		while((inputLine=inLine.readLine())!=null) {
			String[] fields=inputLine.split(",");
			int id=0;
			int age=0;

			//int studentid=0;
			double hourlyWage=0.0;
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
//			try {
//				wage = Integer.parseInt(fields[6]);
//			} catch (NumberFormatException e) {
//				System.out.println("'" + fields[6] + "'" + " is INVALID String representation of int vlaue.");
//				e.printStackTrace();
//			}
			try {
				hourlyWage = Double.parseDouble(fields[6]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[6] + "'" + " is INVALID String representation of double vlaue.");
				e.printStackTrace();
			}
			
			teacher.add(new Teacher(id,age,firstName,lastName,parentFirstName,parentLastName,hourlyWage));
			
			
		}	
			
		}
		return teacher;
		}
	
	
	
}
