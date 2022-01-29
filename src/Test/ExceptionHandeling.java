package Test;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int [] arrayNum= {10,20,24};
		
		try {
			int result = num/0;
			System.out.println(arrayNum[10]);
			
		} 
		
		catch(ArithmeticException e) {
			System.out.println("Only if Arithmetic error, Inside ArithMetic catch block") ;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Only if array out of index error, Inside arrayOutOfBounds exception catch block") ;
		}
		
		catch(Exception e) {
			System.out.println("Only if error, Inside exception catch block") ;
		}
		finally {
				
				System.out.println("inside finally");
			}
			
			System.out.println("after try and catch");

		System.out.println("After Try catch  block");

	}

}
