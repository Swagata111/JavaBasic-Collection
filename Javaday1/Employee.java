public class Employee
{
	public static void main(String[] args)
	{
	int empno,yoh,cyr;
	String fname,lname,midin,dept,hdg,spanish;
	empno=678;
	yoh=1998;
	cyr=2018;
	fname="Swagata:";
	lname="Kundu";
	midin="";
	dept="Cse";
	hdg="Btech";
	spanish="yes";
	if ((hdg.length()>2) && ((cyr-yoh)>=5) && (spanish.equals("yes")))
		System.out.println("Empno: "+empno+" Fname: "+fname+" Lname: "+lname+" Dept: "+dept);
	
	}
	
}