package edu.neu.csye6200;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	 public static void main(String[] args) throws IOException {
	    	Demo.demo();
		
	    }

}
/*
Show: studentid, gpa ,id ,age,firstname, lastname,parentfirstname,parentlastname
The state of all students:
Student [studentid=20001, gpa=3.1, getId()=10001, getAge()=19, getFirstname()=Adam, getLastname()=Smith, getParentfirstname()=Bob, getParentlastname()=Smith]

Student [studentid=20005, gpa=3.0, getId()=10005, getAge()=18, getFirstname()=David, getLastname()=Frank, getParentfirstname()=Chris, getParentlastname()=Frank]

Student [studentid=20002, gpa=3.7, getId()=10002, getAge()=17, getFirstname()=Chris, getLastname()=White, getParentfirstname()=Bob, getParentlastname()=White]

Student [studentid=20000, gpa=3.2, getId()=10000, getAge()=20, getFirstname()=Bobby, getLastname()=Black, getParentfirstname()=David, getParentlastname()=Black]

Show: id, gpa ,id ,age,firstname, lastname,parentfirstname,parentlastname,hourlywage
The state of all teacher:
Teacher [ getId()=10001, getAge()=18, getFirstname()=Adams, getLastname()=Smith, getParentfirstname()=Bobby, getParentlastname()=SmithhourlyWage=160.0]

Sort age of all students:
[Student [studentid=20002, gpa=3.7, getId()=10002, getAge()=17, getFirstname()=Chris, getLastname()=White, getParentfirstname()=Bob, getParentlastname()=White]
, Student [studentid=20005, gpa=3.0, getId()=10005, getAge()=18, getFirstname()=David, getLastname()=Frank, getParentfirstname()=Chris, getParentlastname()=Frank]
, Student [studentid=20001, gpa=3.1, getId()=10001, getAge()=19, getFirstname()=Adam, getLastname()=Smith, getParentfirstname()=Bob, getParentlastname()=Smith]
, Student [studentid=20000, gpa=3.2, getId()=10000, getAge()=20, getFirstname()=Bobby, getLastname()=Black, getParentfirstname()=David, getParentlastname()=Black]
]

Sort ID of all students:
[Student [studentid=20000, gpa=3.2, getId()=10000, getAge()=20, getFirstname()=Bobby, getLastname()=Black, getParentfirstname()=David, getParentlastname()=Black]
, Student [studentid=20001, gpa=3.1, getId()=10001, getAge()=19, getFirstname()=Adam, getLastname()=Smith, getParentfirstname()=Bob, getParentlastname()=Smith]
, Student [studentid=20002, gpa=3.7, getId()=10002, getAge()=17, getFirstname()=Chris, getLastname()=White, getParentfirstname()=Bob, getParentlastname()=White]
, Student [studentid=20005, gpa=3.0, getId()=10005, getAge()=18, getFirstname()=David, getLastname()=Frank, getParentfirstname()=Chris, getParentlastname()=Frank]
]
Sort GPA of all students:
[Student [studentid=20005, gpa=3.0, getId()=10005, getAge()=18, getFirstname()=David, getLastname()=Frank, getParentfirstname()=Chris, getParentlastname()=Frank]
, Student [studentid=20001, gpa=3.1, getId()=10001, getAge()=19, getFirstname()=Adam, getLastname()=Smith, getParentfirstname()=Bob, getParentlastname()=Smith]
, Student [studentid=20000, gpa=3.2, getId()=10000, getAge()=20, getFirstname()=Bobby, getLastname()=Black, getParentfirstname()=David, getParentlastname()=Black]
, Student [studentid=20002, gpa=3.7, getId()=10002, getAge()=17, getFirstname()=Chris, getLastname()=White, getParentfirstname()=Bob, getParentlastname()=White]
]
Sort FirstName of all students:
[Student [studentid=20001, gpa=3.1, getId()=10001, getAge()=19, getFirstname()=Adam, getLastname()=Smith, getParentfirstname()=Bob, getParentlastname()=Smith]
, Student [studentid=20000, gpa=3.2, getId()=10000, getAge()=20, getFirstname()=Bobby, getLastname()=Black, getParentfirstname()=David, getParentlastname()=Black]
, Student [studentid=20002, gpa=3.7, getId()=10002, getAge()=17, getFirstname()=Chris, getLastname()=White, getParentfirstname()=Bob, getParentlastname()=White]
, Student [studentid=20005, gpa=3.0, getId()=10005, getAge()=18, getFirstname()=David, getLastname()=Frank, getParentfirstname()=Chris, getParentlastname()=Frank]
]
Sort LastName of all students:
[Student [studentid=20000, gpa=3.2, getId()=10000, getAge()=20, getFirstname()=Bobby, getLastname()=Black, getParentfirstname()=David, getParentlastname()=Black]
, Student [studentid=20005, gpa=3.0, getId()=10005, getAge()=18, getFirstname()=David, getLastname()=Frank, getParentfirstname()=Chris, getParentlastname()=Frank]
, Student [studentid=20001, gpa=3.1, getId()=10001, getAge()=19, getFirstname()=Adam, getLastname()=Smith, getParentfirstname()=Bob, getParentlastname()=Smith]
, Student [studentid=20002, gpa=3.7, getId()=10002, getAge()=17, getFirstname()=Chris, getLastname()=White, getParentfirstname()=Bob, getParentlastname()=White]
]
*****************************************



*/

