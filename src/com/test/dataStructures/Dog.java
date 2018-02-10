package com.test.dataStructures;

public class Dog implements Comparable<Dog> {
 
//public class Dog{
	
	public Dog(int s) {
		size = s;
	}
	
	
    private int size;
    
    @Override
    public int compareTo(Dog o) {
         return size - o.size;
    }
    
    public String toString() {
    	return size + "";
    	}
}
