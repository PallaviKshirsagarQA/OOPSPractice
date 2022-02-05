package CollectionExample;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq1= new PriorityQueue<String>();

		pq1.add("Nik");
		pq1.add("Mathew");
		pq1.add("Lisa");
		
		System.out.println(pq1);
		
		System.out.println("First Element : " + pq1.peek());
		pq1.poll();
		
		System.out.println("First Element : " + pq1.peek());
		
		
		//ArrayDeque
		
		ArrayDeque<String> dq1= new ArrayDeque<String>();

		dq1.add("Nik");
		dq1.add("Mathew");
		dq1.add("Lisa");
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek()); // gives first value
		System.out.println(dq1.peekFirst()); //gives first value
		System.out.println(dq1.peekLast()); //gives last value
		
//		System.out.println(dq1.poll()); //remove first element
//		System.out.println(dq1);
//		
//		System.out.println(dq1.pollFirst()); //remove first element
//		System.out.println(dq1);
//		
		System.out.println(dq1.pollLast()); //remove first element
		System.out.println(dq1);
		
		
		
		
	}

}
