package exceptionExample;

import java.util.Scanner;

/*---------------------------------------------------------------*/
/*----- Custom exception class for radius ------*/
class RadiusException extends Exception {
	/*---- constructor ----*/
	public RadiusException(String message) {
		super(message);

	}

}

/*--------------------------------------------------------------*/
/*------ Defining  Circle class ----*/
class Circle {
	/*---- Member variables ----*/
	float radius;

	/*----- Constructor -----*/
	public Circle() {
		/*----- Scanner class object ----*/
		Scanner sc = new Scanner(System.in);
		// taking the input through keyboard
		System.out.print("Enter radius of the circle(in cm): ");
		radius = sc.nextFloat();
		System.out.println("-----------------------------------------");
	}

	/*------ Method to display data -----*/
	private void displayInfo() {

		System.out.println("radius : " + radius);

	}

	/*---------------------------------------------------------------------*/
	/*---- method to calculate area -----*/
	public void calculateArea() {
		try {
			if (radius < 0) {
				throw new RadiusException("radius cannot be negative");
			} else {
				float area = 3.14f * radius * radius;
				/*---- displaying data ----*/
				displayInfo();

				System.out.println("Area of the circle :  " + area);

			}
		} catch (RadiusException exceptionObj) {
			System.err.println(exceptionObj.getMessage());
		}
		// method to create calculate perimeter
	}

	public void calculatePerimeter() {
		try {
			if (radius < 0) {
				throw new RadiusException("radius cannot be negative");
			} else {
				float perimeter = 2 * 3.14f * radius;
				/*---- displaying data ----*/
				displayInfo();

				System.out.println("Perimeter of the circle : " + perimeter);
			}
		} catch (RadiusException exceptionObj) {
			System.err.println(exceptionObj.getMessage());
		}
	}
}

/*--------------------------------------------------------------*/
public class CircleCalculator1 {

	public static void main(String[] args) {
		/*---- Object of Circle --*/
		Circle circle = new Circle();
		circle.calculateArea();
		circle.calculatePerimeter();
	}
}
