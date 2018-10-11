public class Employee
{
int id;
String firstName;
String lastName;
int salary;
Employee(int id,String firstName,String lastName,int salary)
{
this.id=id;
this.firstName=firstName;
this.lastName=lastName;
this.salary=salary;

}

public int getId()
{
return id;
}
public String getFirstName()
{
return firstName;
}
public String getFastName()
{
return lastName;
}

public String getName()
{
String n=firstName+" "+lastName;
return n;
}

public int getSalary()
{
return salary;
}

public void setSalary(int salary)
    {
        this.salary = salary;
    }
	
	
public int getAnnualPrice()
{
return salary*12;
}

public int raiseSalary(int percent)
{
ns=int(salary+salary*(percent/100));
return ns;
}

public String toString()
	{
	return "Employee[id="+id+"firstname="+firstname+"lastname="+lastname+"salary="+salary;
	}
}

public class test
{
public static void main(String[] args) 
{
InvoiceItem obj1=new InvoiceItem(10,"Swagata","Kundu",15000);
obj.getId();
obj.getFirstName();
obj.getLastname();
obj.getName();

obj.setSalary(20000);
obj.getAnnualPrice();
obj.raiseSalary(50);
String c=obj.toString();
System.out.println(c);
}
}




