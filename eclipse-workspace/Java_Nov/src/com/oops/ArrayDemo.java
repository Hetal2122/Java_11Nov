package com.oops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Array : It's Collection of data of similar type
 * 1. Start with index 0
 * 2. Size = length - 1
 * 3. If data enter is greater than the size then it will give exception ArrayIndexOutOfBound().
 * 
 * Types Of Array
 * 1. 1D Array :- ex : 1 2 3 4 5
 * 2. 2D Array
 * 3. Jagged/ragged Array
 * 
 * 
 * 
 */

public class ArrayDemo {
	
	public static void main(String[] args) {
		// Syntex : datatype[] [variable_name] = new datatype[size];
		
		//1D array
		
//		int[] a=new int[5]; //0 1 2 3 4
	//	
//		Scanner sc=new Scanner(System.in);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("enter a value :");
//			a[i]=sc.nextInt();
//		}
	//	
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		/*
		 * 12
		 * 34
		 * 1
		 * 67
		 * 3
		 * 
		 * Selection sort
		 */
		
		int[] num= {12,34,1,67,3};
		//num[0]= 12// num[1]=34
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i+1; j < num.length; j++) {
//				if (num[i]>num[j]) {
//					int temp=num[i];
//					num[i]=num[j];
//					num[j]=temp;
//				}
//			}
//			
//		}
		
		System.out.println("Sorted value");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
	Arrays.sort(num);
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
		
	}
	

}
