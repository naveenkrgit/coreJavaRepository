package com.test;

public class ClassB extends ClassA{
	
	public int display(){
		System.out.println("display ..");
		
		return 1;
	}

}


/*
if superClass method is private,then the visibility of the method and return Type in the subClass 
can be changed.

if superClass method is protected,then the visibility of the method and return Type in the subClass 
cannot be changed.

if superClass method is public,then the visibility of the method and return Type in the subClass 
cannot be changed.




*/