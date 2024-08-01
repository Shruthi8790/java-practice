import java.util.Scanner;
public class AverageOfNumbers {
	public static void main(String[] args) {
/*---creating an array of 15 numbers-------*/
	int[] numbers;
/*intializing 15 numbers*/	
	numbers=new int[15];
/*creating a variable for index*/
	int index;
/*creating a object for Scanner class*/
	Scanner sc=new Scanner(System.in);
/*input of data from keyboard*/
	System.out.println("Enter any 15 number:");
	for(index=0;index<numbers.length;index++)
	{
	numbers[index]=sc.nextInt();
	}
/*--Displaying the data-------*/
	System.out.println("-----------");
	System.out.println("Numbers are:");
	for(index=0;index<numbers.length;index++)
	{
	System.out.print(numbers[index]+",");
	}
/*---displaying average of numbers-----*/
int sum=0;
float avg;
for(index=0;index<numbers.length;index++) 
{
sum+=numbers[index];
}
avg=sum/15;
System.out.println("\nAverage of 15 elements are:"+avg);
}
}
