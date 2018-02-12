package com.test.dataStructures;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;

	public void addToFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);

		head = node;

		size ++;
	}


	public void printLinkedList(){
		EmployeeNode current = head;
		System.out.println("HEAD::->");

		while(current != null){
			System.out.println(current);
			System.out.println("->");
			current = current.getNext();

		}

		System.out.println("Null");

	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

}
