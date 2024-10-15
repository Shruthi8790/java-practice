import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
	// creating a object for Scanner class
	Scanner sc=new Scanner(System.in);
	//Taking input through keyboard
	System.out.println("enter a number");
	int a=sc.nextInt();
	if(a%2==0)
	{
		System.out.println(a+" is a even");
	}
	else
	{
		System.out.println(a+" is odd");
	}
	}

}
