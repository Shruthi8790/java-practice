package exceptionExample;

import java.util.Scanner;

//taking the class name by using pascal Casing
public class DivisionExceptionExample {

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

		} catch (ArithmeticException ae) {
			System.out.println("Unable to divide a number by 0:" + ae);
		}
		System.out.println("--------Task Completed------------");
	}
}
