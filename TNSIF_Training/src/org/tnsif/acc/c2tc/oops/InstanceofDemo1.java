package org.tnsif.acc.c2tc.oops;

class Person5
{
	
}

class Employee1 extends Person5
{
	
}
class Manager extends Employee1
{
	
}

public class InstanceofDemo1 {

	public static void main(String[] args) {
		Person5 person=new Person5();
		Employee1 emp=new Employee1();
		Manager manager=new Manager();
		System.out.println(emp instanceof Employee1);//t
		System.out.println(emp instanceof Person5);//t
		System.out.println(emp instanceof Manager);//f
		System.out.println(manager instanceof Manager);//t
		System.out.println(manager instanceof Employee1);//t
		System.out.println(manager instanceof Person5);//t
		System.out.println(person instanceof Employee1);//f
		System.out.println(person instanceof Manager);//f
		

	}

}
