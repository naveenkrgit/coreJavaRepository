package com.test;

public class BasicSynchBlockTest {
	
	private static int count1 = 0;
	private static int count2 = 0;
	
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	
	public synchronized  static  void add(){
		
		synchronized(lock1){
			count1++;
		}
	}
	
	public synchronized static  void addAgain(){
		synchronized(lock2){
			count2++;
		}
	}
	
	public static void compute(){
		
		for(int i=0;i<100;i++){
			add();
			addAgain();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			
			public void run(){
				compute();
			}
		});
		
		
		Thread t2 = new Thread(new Runnable(){
			
			public void run(){
				compute();
			}
		});
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Count 1:>" + count1);
		System.out.println("Count 2:>" + count2);
	}
	
	//use class intrinsic lock cannot be accessed at diff places
	//at the same time.
	//so create separate locks.And then use synchronized blocks.
	//this way threads don't have to wait for 
	//each other when doing independent operations.

}
