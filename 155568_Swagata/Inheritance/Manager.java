package javatest1;

public class Manager extends Employee
{
Manager(long id, String name,String address,long phone,double salary)
	 {
		super(id,name,address,phone);
		this.basicSalary=salary;	
	}
public double calculateTransportAllowance()
{
	double tc=15*basicSalary/100;
	return tc;
}

}
