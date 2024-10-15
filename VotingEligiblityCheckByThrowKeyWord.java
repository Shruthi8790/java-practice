package exceptionExample;

import java.util.Scanner;

//taking a class by using pascal casing format
class AgeException extends Exception {
	/*----Constructor-------*/
	public AgeException(String msg) {
		super(msg);
	}
}

public class VotingEligiblityCheckByThrowKeyWord {

	public static void main(String[] args) {
		int age;
		try (Scanner sc = new Scanner(System.in)) {
			/*----input of age through keyboard-----*/
			System.out.println("Enter age of person(in years): ");
			age = sc.nextInt();
			if (age >= 18) {
				System.out.println("Eligible for Voting");
			} else if (age >= 0) {
				System.out.println("Not Eligible for voting");

			} else {
				throw new AgeException("Negative age is Invalid Age : ");
			}
		} catch (AgeException ae) {
			System.out.println(ae);
		}

	}
}
