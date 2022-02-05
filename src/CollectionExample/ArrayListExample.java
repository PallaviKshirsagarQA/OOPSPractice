package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList1= new ArrayList<String>();
		
		arrayList1.add("Raj");
		arrayList1.add("Priya");
		arrayList1.add("Reema");
		arrayList1.add("Rohan");
		arrayList1.add("Rajendra");
		
		System.out.println("Size of arrayList is : " + arrayList1.size());
		System.out.println(arrayList1);
		
		arrayList1.remove(0);
		
		System.out.println("Size of arrayList is : " + arrayList1.size());
		System.out.println(arrayList1);
		
		System.out.println("first element of arrayList is : " + arrayList1.get(0));
		
		for(int i=0; i<arrayList1.size(); i++) {
			System.out.println(i + " element of arrayList is : " + arrayList1.get(i));
		}
		
		for(String name : arrayList1) {
			System.out.println("Using For each loop - element of arrayList is : " + name);
		}
		
		Iterator<String> itr = arrayList1.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Iterator and while loop - element of arrayList is : " + itr.next());	
		}
		
		//Replacing elements in Array List
		
		arrayList1.set(0, "Pallavi");
		System.out.println("Replaces 1st element value : " + arrayList1);
		
		// ArrayList can have two same values of elements
		
		arrayList1.set(0, "Rohan");
		System.out.println("Duplicate element value Rohan --: "+ arrayList1);
	
	// How to reverse Array List
		ArrayList<String> arrayList2= new ArrayList<String>();
		for(int i=arrayList1.size()-1; i>=0;i--) {
			arrayList2.add(arrayList1.get(i));
			
		}
		System.out.println("Reverse ArrayList --: "+ arrayList1);
		System.out.println("Reverse ArrayList --: "+ arrayList2);
		
		Collections.sort(arrayList2);
		System.out.println("Sorted ArrayList for ArrayList2 --: "+ arrayList2);	
		
	Collections.sort(arrayList1);
	System.out.println("Sorted ArrayList --: "+ arrayList1);
	ArrayList<String> arrayList3= new ArrayList<String>();
	for(int i=arrayList1.size()-1; i>=0;i--) {
		arrayList3.add(arrayList1.get(i));
		
	}
	System.out.println("ArrayList --: "+ arrayList1);
	System.out.println("Descending order ArrayList --: "+ arrayList3);
	
	
	
	
	}
	
	
}
