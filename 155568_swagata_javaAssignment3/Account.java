public class Account
{
String id;
String name;
int balance;
Employee(String id,String name)
{
this.id=id;
this.name=name;
}
Employee(String id,String name,int balance)
{
this.id=id;
this.name=name;
this.balance=balance;
}


public String getId()
{
return id;
}
public String getName()
{
return name;
}

public int getBalance()
{
return salary;
}

public int credit(int amount)
{
balance=balance+amount
return balance;
}

public int debit(int amount)
{
if(amount<=balance)
balance=balance-amount;
else
System.out.println("Amount exceeded balance");
return balance;
}

public int transferTo(Account another,int amount)
{
if(amount<=balance)
{
another.balance=another.balance+amount;
balance=balance-amount;
}
else
System.out.println("Amount exceeded balance");
return balance;
}

public String toString()
	{
	return "Account[id="+id+"name="+name+"balance="+balance;
	}
}

public class test
{
public static void main(String[] args) 
{
Account obj1=new Account("10","Swagata");
Account obj2=new Account("102","Tanusree",100000);
Account obj3=new Account("107","Ash",50000);
obj2.getId();
obj2.getName;
obj2.getBalance();
obj2.credit(1000);
obj2.debit(4000);
obj2.transferTo(obj3,6000);
obj2.toString();
}
}






