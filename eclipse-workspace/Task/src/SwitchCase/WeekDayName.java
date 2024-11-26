package SwitchCase;

/* 3. Write a program to read a weekday number and print weekday name using switch statement*/


public class WeekDayName {
	public static void main(String[] args) {
		
		 int weekdayNumber = 2; 

	        
	        String weekdayName;
	        switch (weekdayNumber) {
	            case 1:
	                weekdayName = "Sunday";
	                break;
	            case 2:
	                weekdayName = "Monday";
	                break;
	            case 3:
	                weekdayName = "Tuesday";
	                break;
	            case 4:
	                weekdayName = "Wednesday";
	                break;
	            case 5:
	                weekdayName = "Thursday";
	                break;
	            case 6:
	                weekdayName = "Friday";
	                break;
	            case 7:
	                weekdayName = "Saturday";
	                break;
	            default:
	                weekdayName = "Invalid weekday number";
	                break;
	        }


	        System.out.println("Weekday name: " + weekdayName);
	}
	

}
