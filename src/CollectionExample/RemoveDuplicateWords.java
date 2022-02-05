package CollectionExample;

import java.util.HashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="clean world green world";
        String [] arr=str.split(" ");
        
        HashSet<String >hs=new HashSet<String>();
        for (int index=0;index<arr.length;index++)
        {
            hs.add(arr[index]);
        }
        //hs.add(arr[1]);
        System.out.println("hs"+hs);

	}

}
