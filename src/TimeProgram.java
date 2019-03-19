public class TimeProgram
{
	private int hours;
	private int minutes;
	
	public void setTime(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public void displayTimeProgram()
	{
		System.out.println("Time in Hours = "+ hours + " and  = minutes " + minutes);
	}
	public TimeProgram sumOfTime(TimeProgram number)
	{
		
		TimeProgram timeNumber3= new TimeProgram();
		timeNumber3.minutes=this.minutes+number.minutes;
		timeNumber3.hours=0;
		if(timeNumber3.minutes>=60)
		{
			timeNumber3.minutes=timeNumber3.minutes-60;
			timeNumber3.hours++;
		}
		timeNumber3.hours=timeNumber3.hours+this.hours+number.hours;
		return timeNumber3; 
		
	}
}
