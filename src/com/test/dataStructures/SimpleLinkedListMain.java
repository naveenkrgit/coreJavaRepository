package com.test.dataStructures;

public class SimpleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee janeJones = new Employee("Jane","Jones",123);
		Employee johnDoe = new Employee("John","Doe",245);
		Employee marySmith = new Employee("Mary","Smith",789);
		Employee mikeWilson = new Employee("Mike","Wilson",422);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		
	}

}
