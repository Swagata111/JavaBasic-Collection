package collectiondemo1;

public class SavingAccount
{
public int acc_balance;
public int acc_ID;
public String accountHolderName;
public boolean isSalaryAccount;

public SavingAccount(int acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) 
{
	this.acc_balance = acc_balance;
	this.acc_ID = acc_ID;
	this.accountHolderName = accountHolderName;
	this.isSalaryAccount = isSalaryAccount;
}
public SavingAccount() {
	// TODO Auto-generated constructor stub
}
public int getAcc_balance() 
{
	return acc_balance;
}
public void setAcc_balance(int acc_balance) {
	this.acc_balance = acc_balance;
}
public int getAcc_ID() {
	return acc_ID;
}
public void setAcc_ID(int acc_ID) {
	this.acc_ID = acc_ID;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public boolean isSalaryAccount() {
	return isSalaryAccount;
}
public void setSalaryAccount(boolean isSalaryAccount) {
	this.isSalaryAccount = isSalaryAccount;
}
public int withdraw(int amount)
{
	acc_balance=acc_balance-amount;
	return acc_balance;
}
public int deposit(int amount)
{
	acc_balance=acc_balance+amount;
	return acc_balance;
}


}
