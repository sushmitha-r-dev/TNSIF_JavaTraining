package org.tnsif.acc.c2tc.interfacedemo;
class SmartLight implements SmartDevice{

	@Override
	public void turnon() {
		System.out.println("Turn on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Turn off");
	}

	@Override
	public void getStatus() {
		System.out.println("Get status");
		
	}
	
}
public class InterFaceDemo1 {

	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
	}

}
