package Array;

import java.util.Arrays;

/* 1. Write a Java program to sort a numeric array and a string array.*/

public class SortingArray {

	public static void main(String[] args) {
		
		int[] numericArray = {5, 2, 8, 1, 3};
	    System.out.println("Original numeric array: " + Arrays.toString(numericArray));
	    Arrays.sort(numericArray);
	    System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

	    // String array
	    String[] stringArray = {"one plus ", "iphone", "oppo", "real me", };
	    System.out.println("Original string array: " + Arrays.toString(stringArray));
	    Arrays.sort(stringArray);
	    System.out.println("Sorted string array: " + Arrays.toString(stringArray));
		
	    
	}	
	
}
