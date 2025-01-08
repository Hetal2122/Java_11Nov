package com.exception;

import java.util.Scanner;

/*24 Dec 24
 * 
 * Throw:-
 * 1. Must be used in user-defined exceptions
 * 2. `throw` is written inside the method
 * 3. `throw` is followed by the `new` keyword and constructor
 * 4. Must inherit the Exception class to make a class user-defined exception
 * 
 * Throws:-
 * 1. Written after the method declaration
 * 2. Can throw not only user-defined exceptions but also system-defined exceptions
 * 3. Multiple exceptions can be thrown, separated by commas
 */

class MyException extends Exception {
	double amount;
	public MyException(double amount) {
		
	}
}
class ATM{
	
	double balance=1000;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("amount deposited :"+amount+ " rs"
				+ " your current balance is: "+balance);
	}
	
	public void withdraw(double amount){
		if(amount<=balance) {
			balance-=amount;
			System.out.println("amount withdrawn :"+amount+ " rs"
					+ " your current balance is: "+balance);
		}else {
			double needs=amount-balance;
		throw new MyException(needs)
			
		}
		
	} 
}
public class UserDefinedException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	ATM atm=new ATM();
	
	double amount;
	System.out.println("Enter the amount to be deposited: ");
	amount=sc.nextDouble();
	atm.deposit(amount);
	
	System.out.println("Enter the amount to be withdraw: ");
	amount=sc.nextDouble();
		atm.withdraw(amount);
//		// TODO Auto-generated catch block
//		System.out.println("If you deposit "+e.amount+ " rs more"
//				+ "you can withdraw "+amount);
//		// TODO: handle exception
}
}