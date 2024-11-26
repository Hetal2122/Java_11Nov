package Condition;


/* 7. Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered through the keyboard.
A triangle is valid if the sum of all the three angles is equal to 180 degrees. */



public class SumofTriangle {
	
public static void main(String[] args) {
		
		int angle1 = 60;
        int angle2 = 70; 
        int angle3 = 50; 

        
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
	}

}
