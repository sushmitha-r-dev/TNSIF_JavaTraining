package org.tnsif.acc.c2tc.oops;
//class
class Calculator{
    int add(int a,int b) {
		return a+b;
	}
	double add(int a,double b, int c) {
		return a+b+c;
}
	double add(double a,int b) {
		return a+b;
	}
}
public class PolymorphismAdd {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(5,6.0,7));
		System.out.println(calc.add(10.0, 20));
	}
}

