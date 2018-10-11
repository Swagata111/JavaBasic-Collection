public class MyDate 
{
	public int day;
	public int month;
	public int year;
	MyDate()
	{
		
	}
	MyDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void validyear() throws InvalidDayException,InvalidMonthException
	{
    try
    {
    	if(day<=0 || day>31)
    		throw new InvalidDayException();
    	else if(month<=0 || month>12)
        	throw new InvalidMonthException();
    	else
    		System.out.println("Valid date");
    }
	catch(InvalidDayException d)
	{
		System.out.println("Invalid Day");
	}
	catch(InvalidMonthException m)
	{
		System.out.println("Invalid Month");
	}
}
	public static void main(String[] args) throws InvalidDayException, InvalidMonthException
	{
		MyDate m=new MyDate(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		m.validyear();
		
	}
	
}
