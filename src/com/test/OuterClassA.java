package com.test;

public class OuterClassA {

	private int count =0;

	private void display(){
		System.out.println("display count ::" + count);
	}

	public Nested_Demo createNestedDemo() {
		return new Nested_Demo();
	}

	static class Nested_Demo {
		private void display(){
			System.out.println("display count ::");
		}

	}

	public static void main(String[] s){
		OuterClassA classA = new OuterClassA();

		//Nested_Demo innerClass = new Nested_Demo();

		classA.createNestedDemo().display();
	}

}
