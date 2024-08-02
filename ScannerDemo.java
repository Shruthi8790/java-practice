import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int age=sc.nextInt();
		System.out.println("Enter a name");
		String name=sc.next();
		//sc.next();
		System.out.println("Enter a father name");
		String fname=sc.next();
		System.out.println("My Age is:" +age);
		System.out.println("My Name is:" +name);
		System.out.println("My Father Name is:" +fname );
	}

}
