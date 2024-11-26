package ClassObject;

/* 2. Write a program to print the area and parameter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle'
with a function to print the area and parameter.*/

public class Triangle {
	
	public static void main(String[] args) {
        // Define the sides of the triangle

        double base = 4;  // Base of the triangle
        double height = 3; // Height of the triangle
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;

        // Calculate the parameter
        double perimeter = side1 + side2 + side3;

        // Calculate the area
        double area = (base * height) / 2;

        // Print the area and parameter
        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

}
