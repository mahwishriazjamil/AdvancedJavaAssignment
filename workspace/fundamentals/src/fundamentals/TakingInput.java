package fundamentals;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number to check...");
//		int userInput = scanner.nextInt();

//		checkIfOddOrEven(userInput);
		ArithmeticCalculator calc = new ArithmeticCalculator(10, 12);
		double answer = calc.add();
		double answerDivide = calc.divide(12, 0);
		System.out.println(answerDivide);
		System.out.println(answer);

		short x = (short) ArithmeticCalculator.add(10,5);

	}

	private static void checkIfOddOrEven(int number) {
		// checking if number is divisible by 2
		if (number % 2 == 0){
			System.out.println("Your number is even!");
		}

		else {
			System.out.println("Your number is odd!");
		}

	}

}
