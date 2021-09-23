package entities;

public class bank {
	private int numberAccount;
	private String holder;
	private double balance;
	
	public bank(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}
	
	public bank(int numberAccount, String holder, double initialDesposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDesposit);
	}


	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public String toString() {
		return "account " +
				numberAccount 
				+ ", Holder: "
				+ holder
				+ ", Balance : $ "
				+ String.format("%.2f", balance);
	}
}
