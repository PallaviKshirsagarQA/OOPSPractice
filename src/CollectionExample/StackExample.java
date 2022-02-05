package CollectionExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1= new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(8);
		stack1.push(12);
	
		System.out.println(stack1)	;
		
		stack1.pop();
		
		System.out.println("After removing last value :  "+ stack1)	;	

		stack1.push(3);
		System.out.println("After removing last value :  "+ stack1)	;
	
		System.out.println("Peek  value shows last value:  "+ stack1.peek())	;
	
		
	}
}
