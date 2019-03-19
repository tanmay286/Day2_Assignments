public class ComplexProgramTest
{
	public static void main(String arg[])
	{
		double realpart;
		double imaginaryPart;
		ComplexProgram complexNumber1=new ComplexProgram();
		complexNumber1.set(2,4);
		complexNumber1.displayComplexProgram();
		
		ComplexProgram complexNumber2=new ComplexProgram();
		complexNumber2.set(4,7);
		complexNumber2.displayComplexProgram();

		ComplexProgram complexNumber3 ;	
		complexNumber3=complexNumber1.sumOfTwoComplexNumbers(complexNumber2);	
		complexNumber3.displayComplexProgram();
	}
}