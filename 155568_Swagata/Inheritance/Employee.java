package javatest1;

public class Employee {
	
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance=250.80;
	public double Hra=1000.50;
	//public double salary;
	 Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	public double calculateSalary()
	{
		 double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		 return salary;
	}
	
	public double calculateTransportAllowance()
	{
		double tc=10*basicSalary/100;
		return tc;
	}
}
