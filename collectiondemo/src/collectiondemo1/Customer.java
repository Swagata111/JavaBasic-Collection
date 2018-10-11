package collectiondemo1;

import java.io.Serializable;

public class Customer implements Serializable
{
private int custNo;
private String custName;
public Customer(int custNo, String custName) {
	this.setCustNo(custNo);
	this.setCustName(custName);
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getCustNo() {
	return custNo;
}
public void setCustNo(int custNo) {
	this.custNo = custNo;
}
@Override
public String toString() {
	return "Customer [custNo=" + custNo + ", custName=" + custName + "]";
}


}
