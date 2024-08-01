import java.util.Scanner;
public class PalindromeOrNot {
public static void main(String[] args) {
/*creating a object for scanner class*/
Scanner sc=new Scanner(System.in);
/* taking a number through keyboard*/
System.out.println("Enter a Number");
int n=sc.nextInt();
int temp=n;
if(isPalindrome(n))
{
	System.out.println(temp+ " is palindrome");
}
else
{
System.out.println(temp+" is not a palindrome");
}
}
public static boolean isPalindrome(int n) {
	int original=n;
	int rev=0;
/*Reverse the number*/
	while(n>0)
	{
		int digit=n%10;
		rev=rev*10+digit;
		n/=10;}
/* check given number is equal to reversed number or not*/
	return original==rev;
    }
}


	


