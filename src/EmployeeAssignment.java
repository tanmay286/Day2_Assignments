public class EmployeeAssignment
{
	private int employeeId;
	private String employeeName;
	private double monthlyBasicSalary;
	private double hra;
	private double pf;
	private double grossSalary;
	private double esic;
	private int professionalTax=100;  
	
	
	private int medicalAllowance =1250;
	private int conveyAllowance=800;
	
	EmployeeAssignment(int employeeId, String employeeName,double monthlyBasicSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.monthlyBasicSalary=monthlyBasicSalary;
	}
	
	public void display()
	{
		System.out.println(" Employee Id is : " + employeeId);
		System.out.println(" Emplyee Name : " + employeeName);
		System.out.println(" Emplyee Salary is :" + monthlyBasicSalary);
	}

	public void annualBasicSalary()
	{
		System.out.println(" Annual Basic Salary is :" + (12 * monthlyBasicSalary));
	}

	public double monthlyGrossSalary()
	{
		hra=(monthlyBasicSalary*50)/100;
		grossSalary=(monthlyBasicSalary + hra + medicalAllowance + conveyAllowance);
		System.out.println(" Monthly Gross Salary : "+ grossSalary);
		return grossSalary;			
	}
	public void annualGrossSalary()
	{
		System.out.println(" Annual Gross Salary :" +(12 * grossSalary));
	}
	public double monthlyDeduction()
	{
		if(monthlyBasicSalary>6500){
			pf=(monthlyBasicSalary*10)/100;
		}
		if(monthlyBasicSalary<=4500)
		{
			esic=(monthlyBasicSalary*4.75)/100;	
		}
		if(grossSalary<=10000)
		{
			professionalTax=50;	
		}
		System.out.println(" Monthly dedution is : "+ (pf + esic + professionalTax));	
		return (pf + esic + professionalTax);		
	}
	public double monthlyTakeHome()
	{
		System.out.println(" Monthly Salary is : " +( grossSalary - monthlyDeduction()));
		return ( grossSalary - monthlyDeduction());	
	}
	public void annualyTakeHome()
	{
		System.out.println(" Annual Salary is : " + (12 * monthlyTakeHome()));
	}
	
}
		