package SwitchCase;

/* 2.Write a program to find the greatest of the three numbers entered through the keyboard using conditional operators.  */

public class GreatestOfThree {

	public static void main(String[] args) {
		
		 int a = 15; 
	     int b= 43; 
	     int c = 28; 

	     int greatest = a > b ? (a > c ? a : c) : (b > c ? b : c);

	    
	     System.out.println("The greatest of the three numbers is: " + greatest);
	}
	
}
