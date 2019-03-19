public class TimeProgramTest
{
	public static void main(String arg[])
	{
		TimeProgram timeNumber1=new TimeProgram();
		timeNumber1.setTime(12,53);
		timeNumber1.displayTimeProgram();
		
		
		TimeProgram timeNumber2=new TimeProgram();
		timeNumber2.setTime(7,45);
		timeNumber2.displayTimeProgram();


		TimeProgram timeNumber3 ;	
		timeNumber3=timeNumber1.sumOfTime(timeNumber2);	
		timeNumber3.displayTimeProgram();
	}
}