
import java.util.*;
public class StringNew 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String st;
	int n;
	
	do
	{
		System.out.println("Enter String:");
		st=s.nextLine();
		try
	{
		n=st.length();
	if(n>20)
		throw new StringTooLongException();
	}
	catch(StringTooLongException stc)
	{
		System.out.println("String too long");
		System.exit(0);
	}
	}while(!st.equals("DONE"));
	
	
	
}
}
