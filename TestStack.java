package com.stack.Test;

import java.util.Scanner;

import com.stack.beans.MyStack;

public class TestStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MyStack ms = new MyStack();
	
		ms.push('n');
		ms.push('i');
		ms.push('k');
		ms.push('h');
		ms.push('i');
		ms.push('l');

		System.out.print(ms.pop());
		System.out.print(ms.pop());
		System.out.print(ms.pop());
		System.out.print(ms.pop());
		System.out.print(ms.pop());
		System.out.println(ms.pop());
		
		System.out.println(ms.isEmpty());
		System.out.println(ms.isFull());
	}
	
}
