package SwitchCase;

/* 1.Write a program using conditional operators to determine whether a year entered through the keyboard is a leap year or not*/


public class CheckLeapYear {
	public static void main(String[] args) {
		
		int year = 2024; 
        boolean isLeap = false;

       
        int caseSelector = (year % 4 == 0 ? 1 : 0) + (year % 100 == 0 ? 2 : 0) + (year % 400 == 0 ? 4 : 0);

        switch (caseSelector) {
            case 0:  
                isLeap = false;
                break;
            case 1:  
                isLeap = true;
                break;
            case 3:  
                isLeap = false;
                break;
            case 5:  
                isLeap = true;
                break;
            default:
                isLeap = false;
                break;
        }

        
        System.out.println("The year " + year + " is " + (isLeap ? "a Leap Year." : "not a Leap Year."));

		
	}
	

}
