package loopMap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int tempNum = 0;
		
		System.out.println("Part 1: Please enter 5 numbers.");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number (#" + (i + 1) + "): " );
			tempNum = scanner.nextInt();
			numbers.add(tempNum);
		}
		
		tempNum = numbers.get(0);
		int sum = tempNum;
		int product = tempNum;
		int largest = tempNum;
		int smallest = tempNum;
		
		for (int i = 1; i < 5; i++) {
			tempNum = numbers.get(i);
			sum += tempNum;
			product *= tempNum;
			if (largest < tempNum) {
				largest = tempNum;
			}
			if (smallest > tempNum) {
				smallest = tempNum;
			}
		}
		
		System.out.println("Sum: " + sum + "\tProduct: " + product + "\tLargest: " + largest + "\tSmallest: " + smallest);
		
		HashMap<String, String> car = new HashMap<>();
		car.put("Camry", "Toyota");
		car.put("F150", "Ford");
		car.put("Camero", "Chevrolet");
		car.put("Malibu", "Chevrolet");
		car.put("Charger", "Dodge");
		
		System.out.print("Part 2: What car (model) are you looking for? ");
		String model = scanner.next();
		if (car.containsKey(model)) {
			System.out.println("Oh, you're looking for a " + model + "? Our " + car.get(model) + " selection is right over here...\nGoodbye!");
		} else {
			System.out.println("Sorry, we do not have that model available. Check back later!\nGoodbye!");
		}
		
		scanner.close();
	}
}
