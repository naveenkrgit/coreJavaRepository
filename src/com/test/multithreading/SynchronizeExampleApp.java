package com.test.multithreading;

public class SynchronizeExampleApp {

	public static int counter = 0;
	
	public static synchronized void increment(){
		for (int i = 0; i < 100; i++) {
			++counter;
		}
	}

	public static void process() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				increment();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				increment();
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

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		System.out.println("Counter::"+ counter);
	}

}
