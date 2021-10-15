package entities5;

public class Individual extends TaxPayer {
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double total;
		if (super.getAnualIncome() < 20000.00) {
			total = super.getAnualIncome() * 0.15;
		} else {
			total = super.getAnualIncome() * 0.25 - getHealthExpenditures() * 0.5;
		}
		if (total < 0.0) {
			total = 0.0;
		}
		return total;
	}

}
