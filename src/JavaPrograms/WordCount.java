package JavaPrograms;

import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		// Word count using Map
		Scanner sr = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>(); // Create an ArrayList object
		HashMap<String, Integer> WordCount = new HashMap<String, Integer>();// Create an HashMap object
		try {
			while (true) {
				System.out.println("\nEnter one of the following choices:");
				System.out.println("Your choices :\n 1-Insert data \n 2-Exit");
				int choice = sr.nextInt();
				if (choice == 1) {
					System.out.println("Enter a String value");
					String str = sr.next();
					words.add(str); // Add string value to ArrayList
				} else if (choice == 2) {
					System.out.println("Thank you!!");
					break;
				} else {
					System.out.println("Sorry please enter a valid number \n");
				}
			}
			for (int i = 0; i < words.size(); i++) {
				if (WordCount.containsKey(words.get(i))) {
					int count = WordCount.get(words.get(i));
					WordCount.put(words.get(i), count + 1);// Add key as string value and value as the count value to
															// Map
				} else
					WordCount.put(words.get(i), 1);
			}
			for (String j : WordCount.keySet()) {
				System.out.println("key: " + j + " value: " + WordCount.get(j));// Display the Map key value pairs
			}
		} catch (Exception e) {
			System.out.println("Something wrong!! Try again.");
		}
	}
}
