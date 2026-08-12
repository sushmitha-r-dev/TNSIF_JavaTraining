package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterFaceDemo {

	Registration sushma=new Student(12,"Sushma",30000.00,"Java Programmming");

	
	
	if(sushma instanceof Registration)
	{
		System.out.println("Student is registered for the course ");
	}
	else
	{
		System.out.println("Student is not registered for the course");
	}
	
}

