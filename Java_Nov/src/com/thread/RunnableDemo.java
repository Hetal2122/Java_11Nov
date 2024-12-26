package com.thread;


class SecondThread implements Runnable{
	
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("This is Second Thread....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
	}
	
}

public class RunnableDemo {
	public static void main(String[] args)throws InterruptedException {
		SecondThread st=new SecondThread();
		Thread t1=new Thread(st);
		t1.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("This ia main thread.....");
			Thread.sleep(2000);
		
	}

}
}