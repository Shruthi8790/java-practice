import java.util.Scanner;
public class AmountCalculator {
/*--Method to calculate simple interest--*/
	public static float calculateSimpleInterest(float principle,float rate,int time)
	{
	float si;
	/* ----calculating simple interest---*/
	si=(principle*rate*time)/100;
	/*---returning simple interest---*/
	return si;
	}
	/*----------------------------------------*/
	public static void main(String[] args) {
/*-creating object of scanner class--*/
	Scanner sc=new Scanner(System.in);
	float principle,rate;
	int time;
/*-----Input from keyboard---*/
	System.out.println("Enter principle(in Rs):");
	principle=sc.nextFloat();
	System.out.println("Enter rate(in %):");
	rate=sc.nextFloat();
	System.out.println("enter Time (in year)");
	time=sc.nextInt();
	/*----------------------------------*/
	/*--------Calculate Simple Interest---*/
	float interest=calculateSimpleInterest(principle,rate,time);
	/*-----to calculate amount--*/
	float amount=principle+interest;
	System.out.println("----------------");
	System.out.println("Amount to br paid after charging simple interest: Rs"+amount);
		}
}
