package Override;

public class Student extends Person {
           String major;
           public Student() {
        	   
           }
           public Student(String major) {
        	   this.major=major;
           }
           public void study() {
        	   System.out.println("people can study"+major);
           }
           public void eat() {
        	   System.out.println("studnet should eat healthy food");
           }
}
