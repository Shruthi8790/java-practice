import java.util.Scanner;
public class LargestOfThree 
{
public static void main(String[] args) {
 /*creating a object for scanner class*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers");
/* Reading three numbers from the user */
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
 /* finding a largest number among three numbers*/
  if (num1>num2)
  {
	  if(num1>num3) {
	  System.out.println(num1+" is greater");
  }
       else  {
    	   System.out.println(num3+" is greater");
       }
  }
  else {
	  if(num2>num3)
	  {
		  System.out.println(num2+" is greater");
	  }
	  else
	  {
		  System.out.println(num3+" is greater");
	  }
    }
  
	
	
	 
 }
	}


