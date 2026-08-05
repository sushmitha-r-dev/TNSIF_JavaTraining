package org.tnsif.acc.c2tc.javabasics;
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Singleton Object Created");
    }
}
public class SingletonDesignPattern {
	 public static void main(String[] args) {

	        Singleton obj1 = Singleton.getInstance();
	        Singleton obj2 = Singleton.getInstance();

	        obj1.display();

	        if (obj1 == obj2)
	            System.out.println("Both objects are the same.");
	        else
	            System.out.println("Objects are different.");
	    }
}
