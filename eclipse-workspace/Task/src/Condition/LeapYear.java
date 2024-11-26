package Condition;

/*
 * 3. Condition Any year is input through the keyboard. Write a program to determine whether the year is a leap year or not. 
 * (Hint: Use the % (modulus) operator)*/


public class LeapYear {
	
	public static void main(String[] args) {
		
		 int year = 2028;
		    boolean leap = false;

		   
		    if (year % 4 == 0) {

		      
		      if (year % 100 == 0) {

		       
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
	}

}
