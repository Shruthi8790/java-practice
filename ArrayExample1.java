import java.util.Scanner;
public class ArrayExample1 {

	public static void main(String[] args) {
        // member variables
	int[] numbers;
	numbers=new int[15];
	int index;
        // Creating object for Scanner class
	Scanner sc=new Scanner(System.in);
	//Taking input through keyboard
	System.out.println("Enter any 15 number:");
	for(index=0;index<numbers.length;index++)
	{
	numbers[index]=sc.nextInt();
	}
	System.out.println();
	}

}
