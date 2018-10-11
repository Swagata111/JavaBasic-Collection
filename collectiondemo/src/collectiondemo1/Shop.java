package collectiondemo1;

import java.util.Date;

public class Shop {

	public static void main(String[] args) throws OrderNotValidException 
	{
		Customer c=new Customer(12,"Swagata");
		Date d1 = new Date(2000, 11, 11);
		Order o=new Order("O123","T.V",d1);
		MyShopping m=new MyShopping();
		m.store(c,o);
		m.storeRecord();
		m.getRecord();
		m.display();
		

	}

	

}
