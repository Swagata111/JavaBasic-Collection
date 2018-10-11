
public class CalculatorSimulator {

	public static void main(String[] args) 
	{
		double tax=0;
		TaxCalculator t=new TaxCalculator();
		
		try {
			 tax=t.calculateTax("Swagata",true,50000);
			 
		} 
		catch (CountryNotValidException e)
		{
			System.out.println("The employee should be an Indian Citizen for calculating tax");
		} catch (EmployeeNameInvalidException e) 
		{
			System.out.println("The employee name cannot be empty");
		} catch (TaxNotEligibleException e) 
		{
			System.out.println("The employee does not need to pay tax");
		}
	
		System.out.println("Tax amount is:"+tax);

	}

}
