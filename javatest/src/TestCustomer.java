import java.util.*;
public class TestCustomer {

	public static void main(String[] args) throws InvalidInputException 
	{
		String cn,cnm,cat;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter CustNo:");
		cn=s.nextLine();
		System.out.println("Enter CustName:");
		cnm=s.nextLine();
		System.out.println("Enter Category:");
		cat=s.nextLine();
		Customer c=new Customer(cn,cnm,cat);
		


	}

}
