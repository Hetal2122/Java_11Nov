package com.collection;

import java.util.ArrayList;

/*
 * 
 * 2 jan 25
 * 
 *  */

public class GenericDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setRoll_no(1);
		s1.setName("Hetal");
		s1.setCity("surat");
		s1.setDegree("MCA");
		
		Student s2=new Student();
		s2.setRoll_no(2);
		s2.setName("Prachi");
		s2.setCity("delhi");
		s2.setDegree("BCA");
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println(a1);
		
//		Iterator<Student> i1=a1.iterator();
//		while (i1.hasNext()) {
//			Student s = (Student) i1.next();
//			
//			System.out.println("roll no is :"+s.getRoll_no());
//			System.out.println("name is :"+s.getName());
//			System.out.println("degree is :"+s.getDegree());
//			System.out.println("city is :"+s.getCity());
//		}
		
		for (Student s : a1) {
			System.out.println("roll no is :"+s.getRoll_no());
			System.out.println("name is :"+s.getName());
			System.out.println("degree is :"+s.getDegree());
			System.out.println("city is :"+s.getCity());
		}
	}

}
