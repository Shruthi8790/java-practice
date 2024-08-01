import java.util.Scanner;
public class Rectangle {
	public static float areaofrectangle(float length,float width) {
		float area=length*width;	
		return area;
	}
	public static float perimeterofrectangle(float length,float width) {
		float  perimeter=2*(length+width);
		return perimeter;

	}
public static void main(String[] args) {
/*----creating a object for scanner class--*/
		Scanner sc=new Scanner(System.in);
/*---taking input from keyboard----*/
System.out.println("Enter a length");
float length=sc.nextFloat();
System.out.println("Enter a width");
float width=sc.nextFloat();
float area=areaofrectangle(length,width);
System.out.println("Area of rectangle is:"+area);
float perimeter=perimeterofrectangle(length,width);
System.out.println("Perimeter of rectangle is:"+perimeter);
}
}
