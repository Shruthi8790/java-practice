import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
	{
	/*----Creating object Scanner Class*/
	Scanner sc=new Scanner(System.in);
	/* creating two variables to store two numbers */
	int n1,n2;
	System.out.println("enter first number:");
	n1=sc.nextInt();
	System.out.println("enter second number:");
	n2=sc.nextInt();
	/*---------------------------------------*/
	/*--------display menu of operations to the user--------*/
	System.out.println("-----------------------");
	System.out.println("-----Numeric Calculation-----")
	System.out.println("1.Addition");
	System.out.println("2.Difference");
	System.out.println("3.Product");
	System.out.println("4.Division");
	System.out.println("---------------------------------");
	/*---------------------------------------------------*/
	/*------------------Asking the user to select any one operatin-----------*/
	System.out.println("select any one option");
	int operation=sc.nextInt();
	/*--------------------------------------------*/
	/*-------performing the operatin as per selection-------*/
	switch(operation)
	{
	case 1:System.out.println("------Addition-------");
	       System.out.println("sum of"+n1+"and"+n2+"is:"+(n1+n2));
	       break;
	case 2:System.out.println("------substraction-------");
    System.out.println("Difference of"+n1+"and"+n2+"is:"+(n1-n2));
    break;
	case 3:System.out.println("------product-------");
    System.out.println("product of"+n1+"and"+n2+"is:"+(n1*n2));
    break;
	case 4:System.out.println("------Division-------");
    System.out.println("on dividing"+n1+"and"+n2+"is:"+(n1/n2));
    System.out.println("QUOTIENT="+(n1%n2));
    System.out.println("Reminder")
    break;
	}
	
	}
	}
}
