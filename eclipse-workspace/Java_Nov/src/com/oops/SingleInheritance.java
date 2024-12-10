package com.oops;

import java.util.Scanner;

class Customer{
	int cust_id;
	String cust_name;
	
	public void setCustData() {
		cust_id=1;
		cust_name="Hetal";
	}
	
}

class Bank extends Customer {
	
	double balance=5000;
	public void deposit(double amount) {
		
		balance+=amount;
		
		System.out.println("cust id :"+cust_id);
		System.out.println("cust name :"+cust_name);
		System.out.println("Amount deposit "+amount+" your balance is :"+balance);
		
	}
	public void withdrow( double amount) {
		
		balance-=amount;
		
		System.out.println("cust id :"+cust_id);
		System.out.println("cust name :"+cust_name);
		System.out.println("Amount withdrow "+amount+" your balance is :"+balance);
	}
	
}

class Interest extends Bank{
	double interest=5,total_interest;
	
	public void calcInterest() {
		
		total_interest=balance*(interest/100);
		System.out.println("Your interest amount is:-"+total_interest);
		balance=balance+total_interest;
		System.out.println("Your balcncde is:-"+balance);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amount;
		Bank bank=new Bank();
		bank.setCustData();
		 
		Interest in;
		in=new Interest();
		in.setCustData();
		System.out.println("Enter amount to be deposit:- ");
		amount=sc.nextDouble();
		bank.deposit(amount);
		
		System.out.println("Enter amount to be withdrow:- ");
		amount=sc.nextDouble();
		bank.withdrow(amount);
		in.deposit(amount);
		in.withdrow(amount);
		in.calcInterest();
	}

}
