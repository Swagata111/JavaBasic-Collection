package collectiondemo1;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) 
	{
		
		SavingAccount s1=new SavingAccount(140000,01,"Swagata",true);
		SavingAccount s2=new SavingAccount(14000,04,"Ash",true);
		SavingAccount s3=new SavingAccount(150000,03,"S.K",false);
		 TreeSet<SavingAccount> hs= new TreeSet<SavingAccount>(new IdComp());
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		s2.withdraw(50000);
		s2.deposit(60000);
		s3.withdraw(4000);
		s3.setSalaryAccount(true);
		s1.setSalaryAccount(false);
		System.out.println("Account details:");
		
		for( SavingAccount s:hs){  
		    System.out.println(s.acc_balance+" "+s.acc_ID+" "+s.accountHolderName+" "+s.isSalaryAccount);  
		}
		

	}

}
