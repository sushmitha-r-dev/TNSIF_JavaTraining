package org.tnsif.acc.c2tc.scannerclass;
import java.util.Scanner;

public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		char ch=sc.next().charAt(2);
	
		System.out.println("char is:"+ch);
		
		
		
		sc.close();
		
		
	}

}
