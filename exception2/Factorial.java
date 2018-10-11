
import java.util.*;

public class Factorial 
{
	Factorial()
	{
	}
 int getFactorial(int num) throws InvalidInputException,Factorialexception
{
	int i;
	int f=1;
	try
	{
		for(i=1;i<=num;i++)
		{
		f=f*i;
		}
		if(num<2)
			throw new  InvalidInputException();
		
		 if(f>2147483647 || f<(-2147483647))
			throw new Factorialexception();
		
	}
	catch(InvalidInputException e)
	{
		System.out.println("Number too small");
	}
	catch(Factorialexception fe)
	{
		System.out.println("Number exceeds max limit");
	}
	return f;
}

public static void main(String args[]) throws InvalidInputException,Factorialexception
{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	n=s.nextInt();
	Factorial ob=new Factorial();
	int j=ob.getFactorial(n);
	if(j>2)
	System.out.println("Factorial:"+j);
    
	
}
}
