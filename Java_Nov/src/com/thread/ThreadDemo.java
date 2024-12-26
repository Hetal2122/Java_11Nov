package com.thread;

import java.util.Iterator;

/* 26 dec 24
 * 
 * Thread :- It is a process
 * single  thread :-
 * multi Thread :-multi processing
 * 
 * main is a thread
 * 
 * thread life cycle
 *  Newborn
 *  Runnable
 *  Running
 *  Block
 *  Dead
 *  
 *  by class:-  extend Thread class
 *  by interface:- implements runnable
 * 
 * */


class FirstThread extends Thread{
	public void run() {
		for (int i=1; i<=5;i++) {
			System.out.println("This is First Thread....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
			
		}
		
	}
}

public class ThreadDemo {
public static void main(String[] args) throws InterruptedException
{
	FirstThread ft=new FirstThread();
	ft.start();
	
	
	for (int i = 1; i <=5; i++) {
		System.out.println("This ia main thread.....");
		Thread.sleep(2000);
	}
	
}
}
