package com.demo.binarySearch;
import java.util.Scanner;
import java.util.*;
import com.demo.binarySearch.BinarySearch;

public class TestBinarySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BinarySearch bs=new BinarySearch();
	
//	int arr[]=new int[9];
//	for(int i=1;i<=9;i++)
//	{
//		System.out.println("Enter array");
//		//int arr[i] = sc.nextInt();
//	}
//	//int arr[i] = sc.nextInt();
	
	bs.insertValue(45);
	bs.insertValue(12);
	bs.insertValue(34);
	bs.insertValue(10);
	bs.insertValue(51);
	bs.insertValue(8);
	bs.insertValue(52);
	bs.insertValue(59);
	bs.insertValue(50);
	
	
	bs.preorder();
	//System.out.println(root.data);
	
	
	if(bs.binarysearchValue(34)) {
		System.out.println("Data Found ");
	}else {
		System.out.println("Data Not Found");
	}
	if(bs.binarysearchValue(8)) {
		System.out.println("Data Found ");
	}else {
		System.out.println("Data Not Found");
	}
	
}
}
