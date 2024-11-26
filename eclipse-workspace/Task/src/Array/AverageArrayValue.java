package Array;

import java.util.Scanner;

/* 2. Write a Java program to calculate the average value of array elements.*/

public class AverageArrayValue {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        
        int[] num = new int[size];

      
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += num[i];
        }

        
        double average = (double) sum / size;

      
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        
        sc.close();
    }

}
