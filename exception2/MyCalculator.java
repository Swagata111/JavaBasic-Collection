
import java.*;
import java.util.Scanner;
public class MyCalculator 
{
public long power(int n,int p) throws Negativeexception ,BothZeroexception
{
	try
	{
	if(n<=0 || p<=0)
		throw new Negativeexception ();
	if(n==0 && p==0)
		throw new BothZeroexception();
	
	}
	catch(Negativeexception  ng)
	{
		System.out.println("n or p should not be zero");
	}
	catch(BothZeroexception b)
	{
		System.out.println("n and p should not be zero");
	}
	long b=(long)Math.pow(n,p);
	return b;
}

public static void main(String args[]) throws Negativeexception ,BothZeroexception
{
	int n,p;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter n:");
	n=s.nextInt();
	System.out.println("Enter p:");
	p=s.nextInt();
	MyCalculator ob=new MyCalculator();
	long j=ob.power(n,p);
	if(j>1)
	System.out.println("Power:"+j);
	
}
}
