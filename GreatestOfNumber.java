//Taking a class name as Greatest of numbers
public class GreatestOfNumber {

	public static void main(String[] args) {
		//member variables
		int num1=64;
		int num2=88;
		int num3=66; 
		int num4=90;
		int num5=40;
        int greatestNumber=num1;
if(num2>greatestNumber)
{
	greatestNumber=num2;
}	
	if(num3>greatestNumber)
{
		greatestNumber=num3;
}
   if(num4>greatestNumber)
{
		greatestNumber=num4;
}
	if(num5>greatestNumber)
{
		greatestNumber=num5;
}
		// displaying the greatest number among five numbers
	  System.out.println("GreatestNumber is:" +greatestNumber);
  }

}


