public class DistanceProgramTest
{
	public static void main(String arg[])
	{
		DistanceProgram distanceNumber1=new  DistanceProgram();
		distanceNumber1.setDistance(16,4);
		distanceNumber1.displayDistanceProgram();
		
		
		DistanceProgram distanceNumber2=new  DistanceProgram();
		distanceNumber2.setDistance(2,13);
		distanceNumber2.displayDistanceProgram();
		


		DistanceProgram distanceNumber3 ;	
		distanceNumber3=distanceNumber1.sumOfTwoDistances(distanceNumber2);	
		distanceNumber3.displayDistanceProgram();
	}
}