public class EmployeeAssignmentTest
{
	public static void main(String arg[])
	{
		EmployeeAssignment employee=new EmployeeAssignment(174932," tanmay",17000);
		employee.display();
		employee.annualBasicSalary();
		employee.monthlyGrossSalary();
		employee.annualGrossSalary();
		employee.monthlyDeduction();
		employee.monthlyTakeHome();
		employee.annualyTakeHome();
	}
}