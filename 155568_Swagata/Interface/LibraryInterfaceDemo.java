package interfacetest;

public class LibraryInterfaceDemo {

	public static void main(String[] args) 
	{
	KidUsers k=new KidUsers();
	k.age=10;
	k.bookType="Kids";
	k.registerAccount();
	k.requestBook();
	KidUsers k1=new KidUsers();
	k1.age=18;
	k1.bookType="Fiction";
k1.registerAccount();
	k1.requestBook();
	AdultUser a=new AdultUser();
	a.age=5;
	a. bookType="Kids";
	a.registerAccount();
	a.requestBook();
	AdultUser a1=new AdultUser();
	a1.age=23;
	a1.bookType="Fiction";
	a1.registerAccount();
	a1.requestBook();
	
	}

}
