package org.tnsif.acc.c2tc.oops;
 //parent class 
class Course{
	String courseName ="Java programming";
	void showCourse() {
		System.out.println("Course:"+courseName);
	}
}
class Student extends Course{
	String studentName="sushmitha";
	void showStudent() {
		System.out.println("student name:"+studentName);
	}
	
}
public class SingleLevelInheritance {
        public static void main(String[] args) {
        	Student student =new Student();
        	student.showCourse();
        	student.showStudent();
        }
}
