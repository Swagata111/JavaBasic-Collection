package javatest1;

public class InheritanceActivity {

	public static void main(String[] args) 
	{
	Manager m1=new Manager(126534,"Peter","Chennai India",237844,65000);
	double b=m1.calculateTransportAllowance();
	double c=m1.calculateSalary();
	System.out.println("Salary of manager:"+c);
	System.out.println("Transport Allowance of manager: "+b);
	Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
	double a=t.calculateTransportAllowance();
	double tc=t.calculateSalary();
	System.out.println("Salary of trainee:"+tc);
	System.out.println("Transport Allowance of trainee: "+a);
	
	

	}

}
