package OOPS;

public class Employee {
	
	String Name;
	int EmployeeId;
	int Salary;
	static String CompanyName="Infosys" ;
	
	public Employee(String Name, int EmployeeId, int Salary)
	{
		this.Name=Name;
		this.EmployeeId=EmployeeId;
		this.Salary=Salary;
	}
	
	public Employee(String Name, int EmployeeId)
	{
		this.Name=Name;
		this.EmployeeId=EmployeeId;
		
	}
	
	public void PrintName() {
		System.out.println("Name of Employee Name is : " + Name  );
	}
	
	public static void changeCompanyName() {
		Employee.CompanyName= "Infosys Technology";
	}
	
	

}
