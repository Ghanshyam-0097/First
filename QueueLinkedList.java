package com.demo.beans;

public class QueueLinkedList {

	Node front = null;
	Node rear = null;
	int val;
	public QueueLinkedList(int val) {
		val=this.val;
	}
	
	class Node {
		String data;
		Node next;
		
		public Node(String val) {
			data = val;
			next = null;
		}
	}
	
	public boolean isEmpty() {
		
		if(front==null) {
			return true;
		}
		return false;
			
	}
	
	public void enqueue(String val) {
		
		Node newNode = new Node(val);
		if(isEmpty()) {
			rear = newNode;
			front = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public String dequeue() {
		if(!isEmpty()) {
			String n = front.data;
			if(rear==front) {
				front=null;
				rear = null;
			}
			else {
				Node temp = front;
				front = front.next;
				temp.next = null;
				temp= null;
			}
			return n;
		}
		return "*";
	}
	
	public void displayAll() {
		Node temp = front;
		for(; temp!=null; temp = temp.next) {
			System.out.print(temp.data + ",");
		}
		System.out.println("----------------------------");
	}
	
	
	
	
	
	
	
	
	
	
}
