package com.demo.stack;


public class MyArrayStack {


	private char[] arr;

	private int top;

	public MyArrayStack() {
		arr = new char[10];
		top = -1;
	}

	public MyArrayStack(int size) {
		arr = new char[size];
		top = -1;
	}


	public boolean isEmpty() {
		return (top == -1);
	}


	public boolean isFull() {
		return (top == arr.length - 1);
	}


	public void push(char data) {
		if (isFull())
			System.out.println("Stack is full.");
		else {
			top++;
			arr[top] = data;
		}
	}


	public void pop() {
		if (isEmpty())
			System.out.println("Stack is empty.");
		else {
			char popedValue = arr[top];
			top--;
			System.out.print(popedValue);
		}
	}

}
