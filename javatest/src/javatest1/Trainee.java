package javatest1;

public class Trainee extends Employee
{
public Trainee(long id, String name,String address,long phone,double salary)
	 {
	super(id,name,address,phone);
	this.basicSalary=salary;	
	}
public double calculateTransportAllowance()
{
	double tc=10*basicSalary/100;
	return tc;
}



}
