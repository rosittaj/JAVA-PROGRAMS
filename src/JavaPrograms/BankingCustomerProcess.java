package JavaPrograms;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class BankingCustomerProcess {
	public static void main(String[] args) {
		List<BankCustomer> BC = new ArrayList<BankCustomer>(); /// Creating list of BankCustomer
		while (true) {
			Scanner sr = new Scanner(System.in);
			System.out.println("\nEnter one of the following choices:");
			System.out.println(
					"Your choices :\n 1-Insert Customer \n 2-Withdraw amount \n 3-Deposit amount \n 4-List customers \n 5-Exit");
			int choice = sr.nextInt();
			if (choice == 1) {
				// Add customer
				System.out.println("Enter new customer name:");
				String customerName = sr.next();
				System.out.println("Enter depositType (fixed/saving):");
				String depositType = sr.next();
				System.out.println("Enter Base Amount:");
				int baseAmount = sr.nextInt();
				BankCustomer b1 = new BankCustomer(customerName, depositType, baseAmount);
				BC.add(b1);// Add to lis
			} else if (choice == 2) {
				// withdraw Amount
				System.out.println("Enter customer name:");
				String customerName = sr.next();
				for (BankCustomer c : BC) {
					if (Objects.equals(c.customerName, customerName)) {
						System.out.println("Enter the amount:");
						int amount = sr.nextInt();
						amount = c.withdrawAmount(amount);// Call withdrawAmount() function from BankCustomer.java
						c.baseAmount = amount;
						System.out.println("The blance is:" + amount);
					}
				}
			} else if (choice == 3) {
				// deposit Amount
				System.out.println("Enter customer name:");
				String customerName = sr.next();
				for (BankCustomer c : BC) {
					if (Objects.equals(c.customerName, customerName)) {
						System.out.println("Enter the amount:");
						int amount = sr.nextInt();
						amount = c.depositAmount(amount);// Call depositAmount() function from BankCustomer.java
						c.baseAmount = amount;
						System.out.println("The blance is:" + amount);
					}
				}
			} else if (choice == 4) {
				// Listing all registerd users.
				System.out.println("Listing all registerd users.");
				for (BankCustomer c : BC) {
					System.out.println(c.customerName + " " + c.depositType + " " + c.baseAmount);
				}
			} else if (choice == 5) {
				System.out.println("Thank you!!");
				break;
			} else {
				System.out.println("Sorry please enter a valid number \n");
			}
		}
	}
}
