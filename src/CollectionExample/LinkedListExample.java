package CollectionExample;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Pallavi");
		list1.add("Joshi");
		list1.add("Kshirsagar");
		list1.add("Kshirsagar"); //Duplicate data is allowed in link list
		list1.addFirst("Pankaj");
		list1.addLast("Aurangabad");
		
		System.out.println("List data : " + list1);
	
		// iterating is same as Array List
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(i + " element of LinkedList is : " + list1.get(i));
		}
		
		Collections.sort(list1);
		System.out.println( " sorted LinkedList is : " + list1);
		
		//adding element in between index
		
		list1.add(3,"Mumbai"); // using index added element in list
		
		System.out.println(list1);
		
	}

}
