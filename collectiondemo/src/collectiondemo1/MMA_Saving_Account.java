package collectiondemo1;

public class MMA_Saving_Account 
{
public String accountId;
public String accountholder_name;
public double accountbalance;
public boolean isSalaryAccount;
public MMA_Saving_Account(String accountId, String accountholder_name, double accountbalance, boolean isSalaryAccount) 
{
	this.accountId = accountId;
	this.accountholder_name = accountholder_name;
	this.accountbalance = accountbalance;
	this.isSalaryAccount = isSalaryAccount;
}
public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public String getAccountholder_name() {
	return accountholder_name;
}
public void setAccountholder_name(String accountholder_name) {
	this.accountholder_name = accountholder_name;
}
public double getAccountbalance() {
	return accountbalance;
}
public void setAccountbalance(double accountbalance) {
	this.accountbalance = accountbalance;
}
public boolean isSalaryAccount() {
	return isSalaryAccount;
}
public void setSalaryAccount(boolean isSalaryAccount) {
	this.isSalaryAccount = isSalaryAccount;
}

}
