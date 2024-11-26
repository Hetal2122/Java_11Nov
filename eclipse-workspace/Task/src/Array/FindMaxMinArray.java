package Array;

/* 6.	Write a Java program to find the maximum and minimum value of an array.*/

public class FindMaxMinArray {
	
	public static void main(String[] args) {
	    int[] array = {55, 4343, 99, 1111, 7, 2};
	        
	        
	        int max = array[0];
	        int min = array[0];
	        
	        
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        
	       
	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);
		}

}
