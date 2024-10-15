import java.util.Scanner;
public class NaturalNumber {

	public static void main(String[] args) {
	// craeting a object for Scanner class
	Scanner sc=new Scanner(System.in);
	int num;
	//Taking input through keyboard
	System.out.println("enter a number");
	num=sc.nextInt();
	if(num>0)
	{
		System.out.println("It is a Natural number");
	}
	else
	{
		System.out.println("It is not a natural number");
	}
	}

}
