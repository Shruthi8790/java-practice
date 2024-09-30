
class AreaCalculator {
	public void calculateArea(int l,int w)
	{
		float area=l*w;
	System.out.println("-------RECTANGLE--------*");
	System.out.println("Length:"+l+"cm");
	System.out.println("Width:"+w+"cm");
	System.out.println("Area:"+area+"cm");
	}
	public void calculateArea(float r)
	{
		float area=3.14f*r*r;
	System.out.println("-------CIRClE--------*");
	System.out.println("Radius:"+r+"cm");
	System.out.println("Area:"+area+"cm");
	}
	public void calculateArea(int s)
	{
		float area=s*s;
	System.out.println("-------SQUARE--------*");
	System.out.println("Side:"+s+"cm");
	System.out.println("Area:"+area+"cm");
	}
	public void calculateArea(float b, int h)
	{
		float area=(b*h)/2;
	System.out.println("-------TRIANGLE--------*");
	System.out.println("Base:"+b+"cm");
	System.out.println("Height:"+h+"cm");
	System.out.println("Area:"+area+"cm");
	}

	public static void main(String[] args) {
	AreaCalculator ac=new AreaCalculator();
	ac.calculateArea(7,8);
	ac.calculateArea(5.0f);
	ac.calculateArea(5);
	ac.calculateArea(6.0f,3);
	
		}
	}
