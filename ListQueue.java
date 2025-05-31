package com.demo.queue;

public class ListQueue {
private Node front,rear;
	
	
	class Node{
		String data;
		Node next;
		public Node(String val) {
			super();
			this.data = val;
			next=null;
		}
		
	}
		
		public void ListQueue(int val) {
			front=null;
		}
	
     public boolean isEmpty() {
			return front==null && rear==null;
		}
		
		public void enqueue(String val) {
			Node newnode=new Node(val);
			if(isEmpty())
			{
				front=newnode;
				rear=newnode;
			}
			else
			{
				rear.next=newnode;
				rear=newnode;
			}
		}
		
		public String dequeue() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
			}
			else 
			{
				System.out.println("in dequeue: "+front.data);
				Node temp=front;
				front=temp.next;
				
				if(front==null)
					rear=null;
				temp.next=null;
				return temp.data;
			}
			return null;
		}
	
	}


	public ListQueue(int i) {
		// TODO Auto-generated constructor stub
	}


	public void enqueue(String val) {
		Node newnode=new Node(val);
		if(isEmpty())
		{
			front=newnode;
			rear=newnode;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		
	}


	private boolean isEmpty() {
		return front==null && rear==null;
	}


	public void dequeue() {
		// TODO Auto-generated method stub
		
	}


//	public String dequeue() {
//		if(isEmpty()) {
//			System.out.println("Queue is Empty");
//		}
//		else 
//		{
//			System.out.println("in dequeue: "+front.data);
//			Node temp=front;
//			front=temp.next;
//			
//			if(front==null)
//				rear=null;
//			temp.next=null;
//			return temp.data;
//		}
//		return -1;
//		
//	}
}


	
	
	
