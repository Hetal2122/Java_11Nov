package Loop;

/*
 *  1.  loop-Write a program to calculate overtime pay of 10 employees. Overtime is paid at the rate of Rs. 12.00 per hour for every hour worked above 40 hours.
  		Assume that employees do not work for fractional part of an hour. */

import java.util.Scanner;

public class OverTime {
	 public static void main(String[] args) {
		  
	      
	        final double OVERTIME_RATE = 12.00;
	        final int REGULAR_HOURS = 40;

	        Scanner scanner = new Scanner(System.in);

	        double[] employeeHours = new double[10];

	   
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter hours worked by employee " + (i + 1) + ": ");
	            employeeHours[i] = scanner.nextDouble();
	        }

	     
	        for (int i = 0; i < 10; i++) {
	            double hoursWorked = employeeHours[i];
	            double overtimePay = 0.00;

	            if (hoursWorked > REGULAR_HOURS) {
	                double overtimeHours = hoursWorked - REGULAR_HOURS;
	                overtimePay = overtimeHours * OVERTIME_RATE;
	            }

	            System.out.printf("Employee %d worked %.2f hours. Overtime pay: Rs. %.2f%n", (i + 1), hoursWorked, overtimePay);
	        }

	        scanner.close();
	    }
	

}
