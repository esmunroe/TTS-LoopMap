package loopMap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int tempNum = 0;
		
		System.out.println("Part 1: Please enter 5 numbers.");
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number (#" + (i + 1) + "): " );
			tempNum = scanner.nextInt();
			numbers.add(tempNum);
		}
		scanner.close();
		
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
	}
}
