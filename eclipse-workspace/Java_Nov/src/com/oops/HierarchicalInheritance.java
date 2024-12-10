package com.oops;
/*
 * 10 dec 24
 *  Hierarchical Inheritance : Single parent multiple child
 * 
 * */

class Parent{
 	String p_name;
 	long ph_no;
 	
 	public void setParent() {
 		p_name = "Dineshbhai";
 		ph_no = 720281874;
 	}
 }
 class Child1 extends Parent{
 	String name = "Hetal";
 	
 	public void show() {
 		System.out.println("For any Complains of "+name+" Call "+p_name+" "+ph_no);
 	}
 }

 class Child2 extends Parent{
 	String name = "Viraj";
 	
 	public void show() {
 		System.out.println("For any Complains of "+name+" Call "+p_name+" "+ph_no);
 	}
 }

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		
		// First Child Data Get And Print
		ch1.setParent();
		ch1.show();
		
		// Second Child Data Get And Print
		ch2.setParent();
		ch2.show();

}
}
