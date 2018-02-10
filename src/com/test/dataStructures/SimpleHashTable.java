package com.test.dataStructures;

public class SimpleHashTable {
	
	/*
	 * Hash the key to the integer.
	 * Storing employees to the HashTable.
	 * Use an array to back the HashTable.
	 * Initialize the Hashtable.
	 */
	
	private Employee[] hashtable;
	
	public SimpleHashTable(){
		hashtable = new Employee[10];
	}
	
	private int hashKey(String key){
		return key.length() % hashtable.length;
	}
	
	private void put(String key,Employee employee){
		int hashedKey = hashKey(key);
		
		if(hashtable[hashedKey]!=null){
			System.out.println("Sorry there is an employee in that position::"+hashedKey);
		}else{
		
			hashtable[hashedKey] = employee;
		}
		
		 
	}
	
	public Employee get(String key){
		int hashedKey = hashKey(key);
		
		return hashtable[hashedKey];
		
	}
	
	public void printHashtable(){
		
		 for(int i=0;i<hashtable.length;i++){
			 System.out.println("Elements of the hashtable::" + hashtable[i]);
		 }
	}

}
