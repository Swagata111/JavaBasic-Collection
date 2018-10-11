package collectiondemo1;

public class Employe_Information 
{
public String empId;
public String Employee_Name;
public String employee_designation;
public double empsal;
public double empcomm;
public Employe_Information(String empId, String employee_Name, String employee_designation, double empsal,
		double empcomm) {
	super();
	this.empId = empId;
	Employee_Name = employee_Name;
	this.employee_designation = employee_designation;
	this.empsal = empsal;
	this.empcomm = empcomm;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmployee_Name() {
	return Employee_Name;
}
public void setEmployee_Name(String employee_Name) {
	Employee_Name = employee_Name;
}
public String getEmployee_designation() {
	return employee_designation;
}
public void setEmployee_designation(String employee_designation) {
	this.employee_designation = employee_designation;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
public double getEmpcomm() {
	return empcomm;
}
public void setEmpcomm(double empcomm) {
	this.empcomm = empcomm;
}
@Override
public String toString() {
	return "Employe_Information [empId=" + empId + ", Employee_Name=" + Employee_Name + ", employee_designation="
			+ employee_designation + ", empsal=" + empsal + ", empcomm=" + empcomm + "]";
}




}
