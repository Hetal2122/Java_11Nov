package com.oops;

import java.awt.image.BandCombineOp;
import java.lang.classfile.AnnotationValue.OfAnnotation;
import java.util.Scanner;
import java.util.function.BiConsumer;

/*
 * Scanner
 * - It's Class
 * - Derived from java util package
 * - Main purpose is to take values from the user
 * - Use system.in as a parameter
 * 
 * Data Type		Scanner class function
 * int				nextInt()
 * float			nextFloat()
 * long				nextLong()
 * Boolean			nextBoolean()
 * Double			nextDouble()
 * char				next().charAt(0)
 * 
 * 
 * Class
 * String
 * word				next()		//Stop reading when space key is pressed
 * line				nextLine()	//Stop reading when enter key is pressed
 * 
 * 
 * 
 * For Buffer cleaning Use : nextLine();
 * 
 */

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter value in A:");
		a=sc.nextInt();
		
		System.out.println("Enter value in B:");
		b=sc.nextInt();
		
		
		System.out.println("Sum of A and B is :"+(a+b));
		
		char ch;
		System.out
		.println("Enter Char Value :");
		ch=sc.next().charAt(0);
		
		
		System.out.println("Character value is:"+ch);
		
		String name;
	//	sc.nextLine();//buffer clean
		
		System.out.println("Entrer your name:");
		name=sc1.nextLine();
		
		System.out.println("Name is :"+name);
		
		
		
	}

}
