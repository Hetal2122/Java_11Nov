package SwitchCase;

/* 7.Write a program to Find the number of days in a month using a switch statement */


public class DayInMonth {
	public static void main(String[] args) {
		 int month = 6; 
	        
	        
	        int days;

	        
	        switch (month) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                days = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                days = 30;
	                break;
	            case 2:
	                days = 28; 
	                break;
	            default:
	                days = -1; 
	                break;
	        }

	        
	        if (days == -1) {
	            System.out.println("Invalid month number.");
	        } else {
	            System.out.println("Number of days in the month: " + days);
	        }
	}


	
}
