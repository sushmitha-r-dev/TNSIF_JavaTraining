package org.tnsif.acc.c2tc.javabasics;

public class PalindromeNumber {
	public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

}
