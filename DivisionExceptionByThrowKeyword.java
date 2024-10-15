package exceptionExample;

import java.util.Scanner;

public class DivisionExceptionByThrowKeyword {
	public static void main(String[] args) {
		int num1, num2;
		// creating object for Scanner class
		System.out.println("------------------------------------------------");
		try (Scanner sc = new Scanner(System.in)) {
			// input of data through keyboard
			System.out.print("Enter first Number: ");
			num1 = sc.nextInt();
			System.out.print("Enter Second Number: ");
			num2 = sc.nextInt();
			System.out.println("On Dividing " + num1 + "by" + num2 + ":");
			if (num2 == 0) {
				throw new ArithmeticException("Unable to divide by zero");

			} else {
				System.out.println("Quotient : " + (num1 / num2));
				System.out.println("Reminder : " + (num1 % num2));
			}

		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("--------Task Completed------------");
	}
}
