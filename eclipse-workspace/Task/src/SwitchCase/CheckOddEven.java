package SwitchCase;

/* 6.Write a program to Check whether the number is even or odd using switch statement*/


public class CheckOddEven {
	
	public static void main(String[] args) {
		 int number = 17; 

	        
	        String result;
	        switch (number % 2) {
	            case 0:
	                result = "Even";
	                break;
	            case 1:
	                result = "Odd";
	                break;
	            default:
	                result = "Invalid"; 
	                break;
	        }

	        
	        System.out.println(number + " is " + result);
	}

}
