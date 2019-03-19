public class RectangleShapeTest
{
	public static void main(String arg[])
	{
		RectangleShape rectangle1=new RectangleShape(123,234);
		System.out.println("------Rectangle 1 --------");
		rectangle1.displayDimensions();			
		rectangle1.rectanglePerimeter();
		rectangle1.rectangleArea();
		rectangle1.displayPerimeter();
		rectangle1.displayArea();
		RectangleShape rectangle2=new RectangleShape(234,123);
		System.out.println("------Rectangle 2 --------");
		rectangle2.displayDimensions();			
		rectangle2.rectanglePerimeter();
		rectangle2.rectangleArea();
		rectangle2.displayPerimeter();
		rectangle2.displayArea();

		if(rectangle1.rectangleArea()==rectangle2.rectangleArea())
		{
			System.out.println(" Both Rectangle having  same area ");
		}
		else
		{
			System.out.println(" Both Rectangle having different area ");
		}
	}
}