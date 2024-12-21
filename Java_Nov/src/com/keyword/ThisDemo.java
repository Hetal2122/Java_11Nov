package com.keyword;

/*
 * 14 dec 2024
 * 
 * This : current class context
 * when the instant/global/class variable name is same as parameter name
 * we use this keyword with instant/global/class variable
 */

class TDemo{
	
	int n1,n2;
	
	public void setData(int num1,int num2) {
		this.n1=num1;
		this.n2=num2;
	}
	
	public void sum() {
		System.out.println("sum is :"+(n1+n2));
	}
}

public class ThisDemo {
	public static void main(String[] args) {
		
		TDemo td=new TDemo();
		td.setData(20, 20);
		td.sum();
	}

}
