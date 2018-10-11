

public class TaxCalculator
{
	public double calculateTax(String empName,Boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException 
	{
		double taxAmount;
		if(isIndian==false)
			throw new CountryNotValidException();
		if(empName==null)
			throw new EmployeeNameInvalidException();
		if(empSal>100000 && isIndian==true)
			taxAmount=empSal*8/100;
		else if((empSal>50000 && empSal<100000) && isIndian==true)
			taxAmount=empSal*6/100;
		else if((empSal>30000 && empSal<50000) && isIndian==true)
			taxAmount=empSal*5/100;
		else if((empSal>10000 && empSal<30000) && isIndian==true)
			taxAmount=empSal*4/100;
		else
			throw new TaxNotEligibleException();
		return taxAmount;	
	}
}

		

