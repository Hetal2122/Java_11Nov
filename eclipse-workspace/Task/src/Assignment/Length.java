package Assignment;

/* 5.The length & breadth of a rectangle and radius of a circle are input through the keyboard. Write a program to calculate the 
area & perimeter of the rectangle, and the area & circumference of the circle*/


public class Length {
	
	public static void main(String[] args) {
		
		
		int Length_R= 50;
		int Breadth_R=15;
		int Radius_C= 12;
		
		int Area_R= Length_R*Breadth_R;
		int Perimeter_R= 2* (Length_R*Breadth_R);
		
		float Area_C= 22/7 * Radius_C*Radius_C;
		float Circumference_C= 2*22/7*Radius_C;
		
		System.out.println("Area of Rectangle is:"+ Area_R);
		System.out.println("Perimeter of Rectangle is:"+ Perimeter_R);
		System.out.println("Area of Circle is:"+ Area_C);
		System.out.println("Circumference of Circle is:"+ Circumference_C);
	
}

}
