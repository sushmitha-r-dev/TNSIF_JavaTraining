package org.tnsif.acc.c2tc.multipleinterface;
interface Vehicle{
	void start();
	void stop();
	int max_speed=120;
	default void repair() {
		System.out.println("vehicle repair is done here");
	}
	static void checkMaintaince() {
		System.out.println("Vehicle maintance taken care here");
	}
}
class Car implements Vehicle{
	private String model;
      Car(String model){
    	  this.model=model;
      }
	@Override
	public void start() {
		System.out.println("Car"+model+"starting");
		
	}

	@Override
	public void stop() {
	System.out.println("Car"+model+"stopping");
	}
	
}
class Bike implements Vehicle{
	private String type;
	Bike(String type){
		this.type=type;
		
	}
	@Override
	public void start() {
		System.out.println("Bike"+type+"starting");
		
	}
	@Override
	public void stop() {
		System.out.println("Bike"+type+"stoping");
		
	}
}




public class Default_Static_Demo {

	public static void main(String[] args) {
		Vehicle car=new Car("Thar");
		Vehicle bike=new Bike("Royal Enfield");
		car.start();
		car.stop();
		car.repair();
		System.out.println("--------");
		bike.start();
		bike.stop();
		bike.repair();
		System.out.println("--------");
		Vehicle.checkMaintaince();
		System.out.println("--------");
		System.out.println("Maxspeed "+Vehicle.max_speed);
		
				

	}

}
