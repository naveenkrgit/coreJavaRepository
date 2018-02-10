package com.test.multithreading;

import java.util.concurrent.BlockingQueue;

public class AppTest {
	
	class FirstWorker implements Runnable{
		
		private BlockingQueue<Integer> mainQueue;
		
		public FirstWorker(BlockingQueue mainQueue){
			this.mainQueue = mainQueue;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	
	class SecondWorker implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
