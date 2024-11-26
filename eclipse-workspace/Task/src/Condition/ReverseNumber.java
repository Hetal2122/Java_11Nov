package Condition;

/* 5. condition---A five-digit number is entered through the keyboard. Write a program to obtain 
the reversed number and to determine whether the original and reversed numbers are equal or not. */


public class ReverseNumber {

	public static void main(String[] args) {
		int number = 12345, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);

	}

}
