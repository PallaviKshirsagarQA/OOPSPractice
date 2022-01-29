package OOPS;

public class HDFCBank extends BankExample {

	@Override
	public void openNewAccount() {
		System.out.println("Inside HDFC open account");		
	}

	@Override
	public void checkBalance() {
		System.out.println("Inside HDFC Balance Info");		
	}

	@Override
	public void depositMoney() {
		System.out.println("Inside HDFC Passbook Print");		
	}
		
	public void creditCard( ) {
		System.out.println("Inside HDFC Credit Card");
	}
	

}
