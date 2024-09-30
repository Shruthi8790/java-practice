interface ThreeDFigure
{
	//--method for curved surface area
	void CalculateCurvedSufaceArea();
	//--method for total surface area
	void CalculateTotalsurfaceArea();
	//--method for volume
	Void CalculateVolume();
}
//---defining cylinder---
class Cylinder implements ThreeDFigure
{
	float radius,height;
	//---constructor---
Cylinder(float radius,float height)
{
	this.radius=radius;
	this.height=height;
}
// displaying radius and height of cylinder
public void display()
{
	System.out.println("----CYLINDER-----");
	System.out.println("Radius;"+radius);
	System.out.println("Height:"+height);
	System.out.println("---------------");
}
//implement the method to calculate the curved surface area
	@Override
	public void CalculateCurvedSufaceArea() {
	float CSA=2*3.14f*radius*height;		
	System.out.println("Curved Surface Area:"+CSA+"sqcm");
	}
	//implement the method to calculate the total surface area
	@Override
	public void CalculateTotalsurfaceArea() {
		float TSA=2*3.14f*radius*(height+radius);
		System.out.println("TOtal Surface Area:"+TSA+"sqcm");
	}
	//implement the method to calculate the volume
	@Override
	public Void CalculateVolume() {
		float volume=3.14f*radius*radius*height;
		System.out.println("Volume:"+volume+"cm");
		return null;
	}
	
}
//intial class
public class Example {

	public static void main(String[] args){
// creating a object for cylinder class
		Cylinder c=new Cylinder(3.4f,5.6f);
		c.display();
		c.CalculateCurvedSufaceArea();
		c.CalculateTotalsurfaceArea();
		c.CalculateVolume();
	}

}
