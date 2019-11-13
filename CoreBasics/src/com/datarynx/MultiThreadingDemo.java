package com.datarynx;

public class MultiThreadingDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			String thereadname = Thread.currentThread().getName();
			System.out.println(thereadname+":"+i);
		}
		
	}
	public static void main(String[] args) {
		MultiThreadingDemo td= new MultiThreadingDemo();
		Thread t1= new Thread(td);
		t1.setName("FirstThread");
		Thread t2= new Thread(td);
		t2.setName("SecondThread");
		t1.start();
		t2.start();
		
	}

}
