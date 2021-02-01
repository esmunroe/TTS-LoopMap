package loopMap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Hello! Enter five (5) numbers to be summed, multiplied, maxed, and mined.");
		for (int i = 0; i < 5; i++) {
			int tempNum = 0;
			
			System.out.print("Enter a number (#" + i + 1 + "): " );
			while (!scanner.hasNextInt()) {
				tempNum = scanner.nextInt();
			}
			numbers.add(tempNum);
		}
	}
}
