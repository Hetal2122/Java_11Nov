package Assignment;

/* 1  Ramesh’s basic salary is input through the keyboard. His dearness allowance is 40% of basic salary, and house rent 
allowance is 20% of basic salary. Write a program to calculate his gross salary. */

public class GrossSalary {
	
public static void main(String[] args) {
		
		int salary= 18000;
		int da= 18000*40/100;
		int hra= 18000*20/100;
		int gross_salary= salary + da+ hra;
		
		System.out.println("Ramesh's Gross Salary is: " + gross_salary);
		
	}

}
