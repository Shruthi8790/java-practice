import java.util.Scanner;
public class ArrayExample3 {
public static void main(String[] args) {
/*-------creating an array of 10 numbers------------*/
int[] numbers;
/*------initialize number of elements i.e 10----*/
numbers=new int[10];
/*-------creating a variable for index-----*/
int index;
/*----object of scanner class----*/
Scanner sc=new Scanner(System.in);
/*----input of date through keyboard---*/
System.out.print("Enter any 10 numbers");
for(index=0;index<numbers.length;index++)
{
	numbers[index]=sc.nextInt();
}
/*-----Displaying the data----------*/
System.out.println("-----------------");
System.out.print("Numbers are:");
for(index=0;index<numbers.length;index++)
{
	System.out.print(numbers[index]+",");
}
/*-----Displaying even numbers only-----*/
System.out.println("\n------------------");
System.out.println("Even numbers are:");
for(index=0;index<numbers.length;index++)
{
	/*checking element of array is even*/
if (numbers[index]%2==0)
{
	System.out.print(numbers[index]+",");
 }
}
}
}
