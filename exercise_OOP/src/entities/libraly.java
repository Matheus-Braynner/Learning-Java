package entities;

public class libraly {
	private String name;
	private long cpf;
	private double balance;
	
	public libraly(String name, long cpf, double initialDeposit) {
		this.name = name;
		this.cpf = cpf;
		deposit(initialDeposit);
	}
	
	public libraly(String name, long cpf) {
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCpf() {
		return cpf;
	}


	public double getBalance() {
		return balance;
	}

	public double deposit (double amount) {
		return balance += amount;
	}
	
	public double withdwaw (double amount) {
		return balance -= amount;
	}
	
	public String toString() {
		return name
				+ ", cpf:  "
				+ cpf
				+ ", your balance R$ "
				+ String.format("%.2f", balance);
	}

}
