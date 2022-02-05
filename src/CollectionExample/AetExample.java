package CollectionExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1= new HashSet<String>();
		
		set1.add("Name1");
		set1.add("Name2");
		set1.add("Name3");
		set1.add("Name4");
		set1.add("Name5");
		set1.add("Name5"); // Duplicate not allowed in set
		set1.add(null); //allowed
		System.out.println(set1);
		
LinkedHashSet<String> set2= new LinkedHashSet<String>();
		
		set2.add("Name1");
		set2.add("Name2");
		set2.add("Name3");
		set2.add("Name4");
		set2.add("Name5");
		set2.add("Name1"); // Duplicate not allowed in set
		set2.add(null); //allowed
		
		System.out.println(set2);

TreeSet<String> set3= new TreeSet<String>();
		
		set3.add("Name2");
		set3.add("Name1");
		set3.add("Name3");
		set3.add("Name5");
		set3.add("Name4");
		set3.add("Name5"); // Duplicate not allowed in set
		//set3.add(null); // Not allowed
		
		System.out.println(set3);

String str1="Clean world green world" ;
String words[]= {};

		
	}

}
