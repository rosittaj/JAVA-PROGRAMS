package JavaPrograms;

public class BankCustomer implements iBanking {
	String customerName;
	String depositType;
	int baseAmount;

	// Parameterized constructor for initialization
	public BankCustomer(String customerName, String depositType, int baseAmount) {
		this.baseAmount = baseAmount;
		this.customerName = customerName;
		this.depositType = depositType;

	}// depositAmount method –add the base amount

	public int depositAmount(int amount) {
		amount = baseAmount + amount;
		return amount;
	}// withdrawAmount method–subtract the base amount

	public int withdrawAmount(int amount) {
		amount = baseAmount - amount;
		return amount;
	}
}
