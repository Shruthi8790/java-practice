package week;
import java.util.Scanner;
//Taking class name as Week
public class Week {

	public static void main(String[] args) {
		//Creating a object for Scanner class
		Scanner sc=new Scanner(System.in);
		//Taking a input through keyboard
		System.out.print("enter your choice");
		int opt=sc.nextInt();
		switch(opt)
		{
		case 1:
		System.out.println("MONDAY");
		break;
		case 2:
		System.out.println("TUESDAY");
		break;
		case 3:
		System.out.println("WEDNESDAY");
		break; 
		case 4:
		System.out.println("THURSDAY");
		break;
		case 5:
		System.out.println("FRIDAY");
		break;
		case 6:
		System.out.println("SATURDAY");
		break;
		case 7:
		System.out.println("SUNDAY");
		break;
		default:
			System.out.println("chose a correct option between 1-7");

	}
}
}

