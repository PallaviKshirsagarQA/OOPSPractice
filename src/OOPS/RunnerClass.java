package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee(); //object
		
		emp1.Name="Sachine";
		emp1.EmployeeId=111;
		emp1.Salary=1000;
		
Employee emp2 = new Employee(); //object
		
		emp2.Name="Mahesh";
		emp2.EmployeeId=222;
		emp2.Salary=2000;
		*/

//		System.out.println("Emp1 name is : " + emp1.Name) ;
//		System.out.println("Emp1 name is : " + emp2.Name) ;
		
		Employee emp1= new Employee("Sachine",111,1000);
		Employee emp2= new Employee("Mahesh",222,2000);
		
		emp1.PrintName();
		emp2.PrintName();
		
		Person per1 = new Person();
		ChildClass child1 = new ChildClass("Rahul",30,"Actor");
		
		
		OverloadingExample obj = new OverloadingExample();
		
		obj.sum(4,6);
		obj.sum(10, 20, 30);
		
		HDFCBank bank1 = new HDFCBank() ;
		bank1.creditCard();
		bank1.checkBalance();
		
		EncapsulationExample obj10 = new EncapsulationExample();
		obj10.setFirstName("Pallavi");
		System.out.println(obj10.getFirstName());
		

	}

}
