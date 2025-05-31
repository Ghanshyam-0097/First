package com.demo.binarySearch;

import com.demo.binarySearch.BinarySearch.Node;

public class BinarySearch {
class Node{
	Node left;
	int data;
	Node right;
	public Node(int val) {
		this.left=null;
		this.right=null;
		data=val;
	}
	
}
Node root;
public BinarySearch() {
	this.root = null;
}


public void insertValue(int val) {
	root=  insertData(root,val);
	
}

private Node insertData(Node root,int val) {
	Node newnode=new Node(val);
	if(root==null) { 
		root=newnode;
		return root;
	}

	if(val<root.data) {
			root.left= insertData(root.left,val);
	}else {
			
			root.right= insertData(root.right,val);
		}
	
	return root;
}
public void preorder() {
	preorderTraversal(root);
	
}

private void preorderTraversal(Node root) {
	if(root!=null) {
		System.out.println("  ll"+root.data);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
}


public boolean binarysearchValue(int i) {
	
	return false;
}
}


