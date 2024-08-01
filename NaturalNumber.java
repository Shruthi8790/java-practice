import java.util.Scanner;
public class NaturalNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
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
