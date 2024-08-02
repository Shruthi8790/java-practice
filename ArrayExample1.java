import java.util.Scanner;
public class ArrayExample1 {

	public static void main(String[] args) {
	int[] numbers;
	numbers=new int[15];
	int index;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 15 number:");
	for(index=0;index<numbers.length;index++)
	{
	numbers[index]=sc.nextInt();
	}
	System.out.println();
	}

}
