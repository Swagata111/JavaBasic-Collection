
import java.util.*;

public class Floatingpointvalues 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int c=0;
	float sum=0;
	System.out.println("Enter limit:");
	int l=s.nextInt();
	float ar[]=new float[10];
	String t;
	System.out.println("Enter Floating Point number:");
	for(int i=0;i<l;i++)
	{
		int f=0;
		t=s.next();
		for(int j=0;j<t.length();j++)
		{
			char p=t.charAt(j);
			if(Character.isLetter(p))
			{
				i--;
				c++;
				try
				{
					throw new InvalidInputException();
				}
				catch(InvalidInputException fgh)
				{
					System.out.println("Not floating point number");
				}
				f=1;
				break;
			}
		}
		if(f==0)
			ar[i]=Float.parseFloat(t);
		if(c==2)
		{
			break;
		}
	}
	for(int i=0;i<l;i++)
	{
		
		sum=sum+ar[i];
	}
	System.out.println("Sum:"+sum);
}
}
