public class ComplexProgram
{
	private double realPart;
	private double imaginaryPart;
	
	public void set(double realPart,double imaginaryPart)
	{
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
	}
	
	public void displayComplexProgram()
	{
		System.out.println("Complex Number = "+realPart+ " Imaginary " + imaginaryPart + "i ");
	}
	public ComplexProgram sumOfTwoComplexNumbers(ComplexProgram number)
	{
		
		ComplexProgram complexNumber3= new ComplexProgram();
		complexNumber3.realPart=this.realPart+number.realPart;
		complexNumber3.imaginaryPart=this.imaginaryPart+number.imaginaryPart;
		return complexNumber3; 
		
		
	}
}
