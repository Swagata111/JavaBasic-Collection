

public class Student 

{
public int rollno;
public String name;
public int age;
public String course;

Student(int rollno,String name,int age,String course)
{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	this.course=course;
}
public void valid() throws AgeNotWithinRangeException,NameNotValidException
{
	int f=0;
try
{
	if(age<15 || age>21)
		throw new AgeNotWithinRangeException();
	String s=name.toLowerCase();
    for(int i=0; i<s.length();i++)
    {
        if((s.charAt(i)>='a' && s.charAt(i)<='z'))
        {
            continue;
        }
        else
        {
        	f=1;
          
        }
        
    }
    if(f==1)
   	 throw new NameNotValidException();
}
catch(AgeNotWithinRangeException e)
{
	System.out.println("Age not valid");
}
catch(NameNotValidException c)
{
	System.out.println("Name is not valid");
}
}
}