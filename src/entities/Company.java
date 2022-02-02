package entities;

public class Company extends TaxPayer{

	private final Integer EMP_LIMIT = 10;
	
	protected Integer numberOfEmployees;
	
	public Company (){
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if(numberOfEmployees>EMP_LIMIT) {
			return getAnualIncome()*0.14;
		}
		else {
			return getAnualIncome()*0.16;
		}
	}

	
}
