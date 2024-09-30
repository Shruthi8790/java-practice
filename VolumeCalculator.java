class 
	/*----Method to calculate the volume of cube----*/
	public void calculateVolume(int side)
	{
		float volume=side*side*side;
		System.out.println("------CUBE-------");
		System.out.println("Side="+side+"cm");
		System.out.println("Volume="+volume+"cubic cm");
	}
	/*----method to calcukate the volume of sphere-----------*/
	public void calculatevolume(float radius)
	{
		float volume=(4*3.14f*radius*radius*radius)/3;
		System.out.println("-----SPHERE-------");
		System.out.println("Radius="+radius+"cm");
		System.out.println("Volume="+volume+"cm");
}
public class MethoOverloadingExample{
	
}
public void main(String[] args) {
	{
		/*creating the object of volumecalculator*/
	
volumecalculator vc=new volumecalculator();
vc.calculatevolume(7.0f);
vc.calculatevolume(6);


	}

}

public class VolumeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
