package Condition;

/* 8. Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter.
For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter.
*/

public class LengthofRectangle {
	
public static void main(String[] args) {
	
	 int length = 5; 
     int breadth = 4; 

     
     int area = length * breadth;

     
     int perimeter = 2 * (length + breadth);

     
     if (area > perimeter) {
         System.out.println("The area of the rectangle is greater than its perimeter.");
     } else {
         System.out.println("The area of the rectangle is not greater than its perimeter.");
     }
}

}
