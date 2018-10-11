
import java.util.*;
public class StringNew 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String st;
	int n;
	System.out.println("Enter String:");
	do
	{
		st=s.nextLine();
	}while(!st.equals("DONE"));
	n=st.length();
	if(n>20)
		throw new StringTooLongException();
	
}
}
