package com.exception;

/*
 * 24 dec 24 
 * 
 * Exception:  Any Abnormal Condition
 * Exception class is root class of all exception class  
 * 
 * Error:- 3 type
 * 
 * 1. compiler time error:-  , } ; missing systax error
 * 2. run time error :  1.Arithmetic exception
 * 						2.ArrayIndexOutofBound 
 * 3.error: dev mistak .infinity loop
 * 
 * 
 * 5 keywords :-
 *  	
 *  1 try:-
 *  
 *  	1. If we have a doubt that any might have error we keep that the code inside try block
 *  	2. try skips the error code execute remaining code.
 *  	3. try throws the error to catch.
 *  	4. try followed by catch or finally or both
 *  
 *  2.catch:-
 *    
 *    	1.Handles the error thrown by try
 *    	2.there can be multiple catch
 *    
 *  3. finally :-
 *  
 *  	whether error is there or not finally  block will be executed
 *    
 * 4.throw
 * 5.throws
 * 
 * 
 * */

public class Exception {
	public static void main(String[] args) {
		int a=20,b=0;
		
		try {
			System.out.println("div is :"+a/b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("For any query contact tops");
		}
		
		
		System.out.println("This code is written by Hetal");
		
		
		
	}

}
