package Assignment;

/* 2 The distance between two cities (in km.) is input through the keyboard. Write a program to convert and print this distance 
in meters, feet, inches and centimeters. */

public class Distance {
	
	public static void main(String[] args) {
		
		 double kilometers = 65; 

	        
	        double meters = kilometers * 1000;
	        double feet = kilometers * 3280.84;
	        double inches = kilometers * 39370.1;
	        double centimeters = kilometers * 100000;

	        
	        System.out.println("Distance in kilometers: " + kilometers);
	        System.out.println("Distance in meters: " + meters);
	        System.out.println("Distance in feet: " + feet);
	        System.out.println("Distance in inches: " + inches);
	        System.out.println("Distance in centimeters: " + centimeters);
		
		       
		}

}
