package org.tnsif.acc.c2tc.oops;
class Device{
	void deviceType() {
   System.out.println("I have an elecric device");

	}
}
class Phone extends Device{
	void brand() {
		System.out.println("Brand:Samsung");
	}
}
class SmartPhone extends Phone{
	void features() {
		System.out.println("Features:Touchscreen,camera,internet");
	}
}

public class MultiLevelInteritance {

	public static void main(String[] args) {
		SmartPhone smartphone =new SmartPhone();
		smartphone.deviceType();
		smartphone.brand();
		smartphone.features();
		

	}

}
