package org.tnsif.acc.c2tc.exceptionhanding;

public class StringIndexoutOfBoundDemo {

	public static void main(String[] args) {
		String str="Hello";
		try {
		char ch=str.charAt(5);
		System.out.println(ch);

	}catch(StringIndexOutOfBoundsException e) {//	System.out.println(e);
	}

}
}
