
public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber = "";
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		super.deposit(super.getBalance() * (rate/12));
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
