
import java.util.*;

public class Floatingpointvalues 
{
public static void main(String[] args) throws ExceedException
{
	Scanner s=new Scanner(System.in);
	int c;
	System.out.println("Enter limit:");
	int l=s.nextInt();
	float ar[]=new float[l];
	
	for(int i=0;i<l;i++)
	{
		c=0;
		System.out.println("Enter number :"+i);
		ar[i]=s.nextFloat();
		if(ar[i]==Float.NaN)
		{
			i--;
			c++;
		}
		try
		{
	    if(c==2)
	   throw new ExceedException();
		}
		catch(ExceedException ee)
		{
			System.out.println("No more chance");
		}
			
	}
}
}
