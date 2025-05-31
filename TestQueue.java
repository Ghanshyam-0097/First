package com.demo.queue;
import java.util.Scanner;
import com.demo.queue.ListQueue;
public class TestQueue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        ListQueue lq = new ListQueue(10);
		
//		for(int i=1; i<=10; i++)
//		{
//		 System.out.println("Enter String");
//		 String val= sc.next();
//		 
//        //String val;
			

			
			
		//}
//		String val = null;
		lq.enqueue("tanu");
		lq.enqueue("ranu");
		lq.enqueue("rina");
		lq.enqueue("gita");
		lq.enqueue("raju");
		lq.enqueue("sharu");
		lq.enqueue("neha");
		lq.enqueue("ram");
		lq.enqueue("sita");
		
		lq.dequeue();
		lq.dequeue();
		   
	}

}
