import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		//Creating object for Scanner class
		Scanner sc=new Scanner(System.in);
		// taking input through keyboard
		System.out.println("Enter a number:");
		int age=sc.nextInt();
		System.out.println("Enter a name");
		String name=sc.next();
		//sc.next();
		System.out.println("Enter a father name");
		String fname=sc.next();
		// Displaying the data on console
		System.out.println("My Age is:" +age);
		System.out.println("My Name is:" +name);
		System.out.println("My Father Name is:" +fname );
	}

}
