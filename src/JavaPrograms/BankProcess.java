package JavaPrograms;

import java.util.*;

class Customer {
	String bankName, customerName, depositType;
	int baseAmount;

	public Customer(String customerName, String depositType, int baseAmount, String bankName) {
		this.bankName = bankName;
		this.customerName = customerName;
		this.depositType = depositType;
		this.baseAmount = baseAmount;
	}
}

class Bank {
	String bankName;

	public Bank(String bankName) {
		this.bankName = bankName;
	}
}

public class BankProcess {
	// Method to add new bank
	public static String AddBank(Scanner sr) {
		System.out.println("Enter new bank branc:");
		String bankName = sr.next();
		return bankName;
	}

	public static void main(String[] args) {
		List<Bank> bk = new ArrayList<Bank>();
		List<Customer> list = new ArrayList<Customer>();// Creating list of Customer
		String bankName;
		try {
			while (true) {
				Scanner sr = new Scanner(System.in);
				System.out.println("\nEnter one of the following choices:");
				System.out.println(
						"Your choices :\n 1-Insert Bank \n 2-Insert Customer \n 3-List customers \n 4-Exit");
				int choice = sr.nextInt();
				if (choice == 1) {
					// Initialize the new bank
					bankName = AddBank(sr);
					Bank b1 = new Bank(bankName);
					bk.add(b1);
				} else if (choice == 2) {
					// Add customer details of a particular bank
					System.out.println("Enter new customer name:");
					String customerName = sr.next();
					System.out.println("Enter depositType (fixed/saving):");
					String depositType = sr.next();
					System.out.println("Enter Base Amount:");
					int baseAmount = sr.nextInt();
					System.out.println("Enter bank name:");
					String bank = sr.next();
					for (Bank i : bk) {
						if (Objects.equals(i.bankName, bank)) {
							Customer c1 = new Customer(customerName, depositType, baseAmount, bank);
							list.add(c1);
							System.out.println("Created new account");
						}
					}
				} else if (choice == 3) {
					// View of customer details of a particular bank
					System.out.println("Enter bank name:");
					String bank = sr.next();
					for (Customer c : list) {
						if (Objects.equals(c.bankName, bank)) {
							System.out.println(
									c.bankName + " " + c.customerName + " " + c.depositType + " " + c.baseAmount);
						}
					}
				}else if (choice == 4) {
					System.out.println("Thank you!!");
					break;
				} else {
					System.out.println("Sorry please enter a valid number \n");
				}
			}
		} catch (Exception e) {
			System.out.println("Something wrong!! Try again.");
		}
	}
}
