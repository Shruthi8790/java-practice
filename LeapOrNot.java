
public class LeapOrNot {

	public static void main(String[] args) {
		int year=2024;
		if(year%4==0 && year%400==0){
			System.out.println(year+ " is a Leap year");
			
		}
		else if(year%4==0 && year%100!=0)
		{
			System.out.println(year+ " is Leap year");
		}
		else
		{
			System.out.println(year+ " isn't Leap year");
			
		}

	}

}
