package Assignment;

/* 7.If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.*/

public class SumOfDigit {
	
	public static void main(String[] args) {
		
		int num = 67895; 
	    int d1 = num / 10000;
	    int d2 = (num / 1000) % 10;
	    int d3 = (num / 100) % 10;
	    int d4 = (num / 10) % 10;
	    int d5 = num % 10;
	    
	    
	    int sum = d1 + d2 + d3 + d4 + d5;
	    
	    
	    System.out.println("The sum of the digits is: " + sum);
	}	

}
