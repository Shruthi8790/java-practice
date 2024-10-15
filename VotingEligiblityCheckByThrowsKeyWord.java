package exceptionExample;

import java.util.Scanner;

class AgeException extends Exception {
	/*----Constructor-------*/
	public AgeException(String msg) {
		super(msg);
	}
}

class Voter {
	int age;

	public Voter() {
		Scanner sc = new Scanner(System.in);
		// input of age through keyboard
		System.out.println("Enter age of person (in years): ");
		age = sc.nextInt();

	}

	// Method to check voting eligiblity
	public boolean isEligible() throws AgeException {
		if (age >= 18) {
			return true;
		} else if (age > 0) {
			return false;
		} else {
			throw new AgeException("Negative age is Invalid :");
		}
	}
}

public class VotingEligiblityCheckByThrowsKeyWord {

	public static void main(String[] args) {
		Voter voterobj = new Voter();
		try {
			voterobj.isEligible();
		} catch (AgeException ae) {
			System.out.println(ae.getMessage());
		}

	}
}
