package org.tnsif.acc.c2tc.javabasics;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		 int[] arr = {10, 20, 30, 20, 40, 10, 50};

	        System.out.println("Duplicate Elements:");

	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            for (int k = 0; k < i; k++) {
	                if (arr[i] == arr[k]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                for (int j = i + 1; j < arr.length; j++) {
	                    if (arr[i] == arr[j]) {
	                        System.out.println(arr[i]);
	                        break;
	                    }
	                }
	            }
	        }
		

	}

}
