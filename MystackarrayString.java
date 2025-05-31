package com.demo.stack;

public class MystackarrayString {
	
    class MyStackArrString {
		 private char[] arr;
		   private int top;
		   
		
		public MyStackArrString() {
			 super();
			arr=new char[10];
			top=-1;
		}
		
		public MyStackArrString(int size) {
			super();
			arr=new char[size];
			top=-1;
		}

		public boolean isEmpty() {
			return top==-1;
		}
		public boolean isFull() {
			return top==arr.length-1;
		}
		public  void push(char c) {
			if(isFull()) {
				System.out.println("Stack is full");
			}else {
				top++;
				arr[top]=c;
			}
		}
		public char pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}else{
				char S=arr[top];
				top--;
				return S;
			}
			//return -1;
			return '$';
		}
		  	  
    }

	
	}
    
}



