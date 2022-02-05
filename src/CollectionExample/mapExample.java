package CollectionExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(1,"Pallavi");
		map1.put(2,"Supriya");
		map1.put(3,"Sarika");
		map1.put(4,"Madhura");
		map1.put(5,"Shraddha");
		map1.put(6,"Shraddha");
		
		System.out.println(map1);
		
		map1.put(5,"Reena");
		System.out.println(map1);
		
		map1.remove(6);
		System.out.println(map1);
		
		System.out.println(map1.get(1));
		
	
		// LinkedHashed map follows order entered
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1,"Pallavi");
		map2.put(4,"Supriya");
		map2.put(5,"Sarika");
		map2.put(2,"Madhura");
		
		System.out.println(map2);
		
		// TreeHashed map follows ascending order of key
				TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
				
				map3.put(1,"Pallavi");
				map3.put(4,"Supriya");
				map3.put(5,"Sarika");
				map3.put(2,"Madhura");
				
				System.out.println(map3);
		
				// how to iterate map		
				
				for(Map.Entry<Integer, String> entry1 : map3.entrySet()) {
					
					System.out.println(entry1.getKey());
					System.out.println(entry1.getValue());
				}
				
				// iteration using keySet()
				
				for(int val : map3.keySet()) {
					System.out.println("key is " + val);
					System.out.println("Value is " + map1.get(val));
				}
				
				// iteration using ValueSet()
				
				for(String val : map3.values()) {
					System.out.println(val);
				}
		
		
	}

}
