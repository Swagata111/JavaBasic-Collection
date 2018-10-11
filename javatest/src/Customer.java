
public class Customer
{
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo, String custName, String category) throws InvalidInputException
	{
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
		try
		{
		if((custName.length()>=4) && ((category.equals("Platinum")) || (category.equals("Gold")) || (category.equals("Silver"))) && ((custNo.charAt(0)=='C') || (custNo.charAt(0)=='c')))
		{
			System.out.println("Details accepted");
			System.out.println(custNo);
			System.out.println(custName);
			System.out.println(category);
		}
		else
			throw new InvalidInputException();
		}
		catch(InvalidInputException e)
		{
			System.out.println("Invalid details");
		}
			
	}
	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCategory() {
		return category;
	}
	
	
}
