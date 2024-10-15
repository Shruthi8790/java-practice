//taking class name as AreaCalculator
class AreaCalculator {
	//Method for calculating area of the Rectangle
	public void calculateArea(int l,int w)
	{
		float area=l*w;
	System.out.println("-------RECTANGLE--------*");
	System.out.println("Length:"+l+"cm");
	System.out.println("Width:"+w+"cm");
	System.out.println("Area:"+area+"cm");
	}
	//Method for calculate area of the Circle
	public void calculateArea(float r)
	{
		float area=3.14f*r*r;
	System.out.println("-------CIRClE--------*");
	System.out.println("Radius:"+r+"cm");
	System.out.println("Area:"+area+"cm");
	}
	//method for calculating Area of the Square
	public void calculateArea(int s)
	{
		float area=s*s;
	System.out.println("-------SQUARE--------*");
	System.out.println("Side:"+s+"cm");
	System.out.println("Area:"+area+"cm");
	}
	//Method for calculating area of the Triangle
	public void calculateArea(float b, int h)
	{
		float area=(b*h)/2;
	System.out.println("-------TRIANGLE--------*");
	System.out.println("Base:"+b+"cm");
	System.out.println("Height:"+h+"cm");
	System.out.println("Area:"+area+"cm");
	}

	public static void main(String[] args) {
		//Creating a object for Main class
	AreaCalculator ac=new AreaCalculator();
		//calling a CalculateArea method of Rectangle
	ac.calculateArea(7,8);
		//calling a CalculateArea method of Circle
	ac.calculateArea(5.0f);
		//calling a CalculateArea method of Square
	ac.calculateArea(5);
		//calling a CalculateArea method of Triangle
	ac.calculateArea(6.0f,3);
	
		}
	}
