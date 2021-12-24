package JavaPrograms;

import java.util.*;

public class JavaDataTypes {

	public static void main(String[] args) {
		try {
			// The Java Typecasting and types of java type casting
			Scanner sr = new Scanner(System.in);
			// Widening Type Casting
			System.out.println("Enter a Integer value");
			int num1 = sr.nextInt();
			System.out.println("Before conversion, int value:" + num1);
			float n1 = num1; // automatically converts the long type into float type
			System.out.println("After conversion, float value: " + n1);
			long n2 = num1; // automatically converts the integer type into long type
			System.out.println("After conversion, long value: " + n2);
			// Narrowing Type Casting
			System.out.println("\nEnter a Double value");
			double num2 = sr.nextDouble();
			System.out.println("Before conversion, double value:" + num2);
			// converting double data type into long data type,fractional part lost
			long l = (long) num2;
			System.out.println("After conversion into long type: " + l);
			int i = (int) num2; // converting long data type into int data type
			System.out.println("After conversion into int type: " + i);
		} catch (Exception e) {
			System.out.println("Something wrong!! Please try again");
		}

	}

}
