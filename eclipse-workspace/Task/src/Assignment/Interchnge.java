package Assignment;

/* 6.Two numbers are input through the keyboard into two ocations C and D. 
 * Write a program to interchange the contents of C and D.*/


public class Interchnge {
	
	public static void main(String[] args) {
		 int C = 18; 
	     int D = 43; 

	     
	     System.out.println("Before swapping: C = " + C + ", D = " + D);

	     
	     int temp = C;
	     C = D;
	     D = temp;

	     
	     System.out.println("After swapping: C = " + C + ", D = " + D);
	}

}
