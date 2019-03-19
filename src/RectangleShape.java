public class RectangleShape
{
	private double rectangleHeigth;
	private double rectangleWidth;
	
	RectangleShape(double rectangleHeigth,double rectangleWidth)
	{
		this.rectangleHeigth=rectangleHeigth;
		this.rectangleWidth=rectangleWidth;
	}
	
	public void displayDimensions()
	{
		System.out.println(" Length of rectangle is " + rectangleHeigth);
		System.out.println(" Width of rectangle is " + rectangleWidth);	
	}
	public void displayArea()
	{
		System.out.println(" Area of rectangle : " +rectangleArea());
	}
	public void displayPerimeter()
	{
		System.out.println(" Perimeter of rectangle : " +rectanglePerimeter());
	}
	public double rectanglePerimeter()
	{
		return (2*(rectangleHeigth+rectangleWidth) );
	}
	public double rectangleArea()
	{
		
		return ( rectangleHeigth * rectangleWidth);
	}
}