package org.tnsif.acc.c2tc.javabasics;

public class SecondLargestElement {
	 public static void main(String[] args) {

	        int[] arr = {12, 45, 8, 67, 34, 67, 20};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {

	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        System.out.println("Largest = " + largest);
	        System.out.println("Second Largest = " + secondLargest);
	    }
	}

