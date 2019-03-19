public class DistanceProgram
{
	private int feet;
	private double inches;
	
	public void setDistance(int feet,double inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	
	public void displayDistanceProgram()
	{
		System.out.println("Distance in Feet = "+feet+ ",Inches = " + inches);
	}
	public DistanceProgram sumOfTwoDistances(DistanceProgram number)
	{
		
		DistanceProgram distanceNumber3= new DistanceProgram();
		distanceNumber3.inches=this.inches+number.inches;
		distanceNumber3.feet=0;
		if(distanceNumber3.inches>=12)
		{
			distanceNumber3.inches=distanceNumber3.inches-12;
			distanceNumber3.feet++;
		}
		distanceNumber3.feet=distanceNumber3.feet+this.feet+number.feet;
		return distanceNumber3; 
		
	}
}
