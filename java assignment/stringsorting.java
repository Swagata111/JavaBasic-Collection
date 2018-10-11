import java.util.*;
public class stringsorting
{
public static void main(String[] args)
{
int i,j,l;
char ch;
Scanner sc=new Scanner(System.in);
String str[]=new String[100];
for(i=0;i<10;i++)
str[i]=sc.next();
String pnd="";
for(i=0;i<10;i++)
{
	String t=str[i];
	StringBuffer b=new StringBuffer(str[i]);
	if((b.reverse().toString()).equals(t))
	{
	pnd=str[i];
	}
	
}
System.out.println("Pallindrome= "+pnd);
l=p.length();
char r[]=new char[10];
for(i=0;i<n;i++)
{
for(j=1;j<n-i-1;j++}
{
if(r[j]<r[j+1])
{
 ch=r[j];
r[j]=r[j+1];
r[j+1]=ch;
}
}
} 
System.out.println("Length= "+l);
System.out.println("Sorted string: ");
for(i=0;i<l;i++)
System.out.println(r[i]);
}
}