package collectiondemo1;
import java.util.*;
import java.io.*;


public class MyShopping
{
	private static Hashtable<Customer, Order> h=new Hashtable<Customer, Order>();
	
	public void store(Customer c,Order o)
	{
		h.put(c,o);
		
	}
	public void storeRecord()
	{
		/*try (FileOutputStream fos = new FileOutputStream("record.dat");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) 
			{
	            oos.writeObject(h);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }*/
		
	}
	public void getRecord()
	{
		/*try (FileInputStream fis = new FileInputStream("record.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) 
		{
			Customer c = (Customer) ois.readObject();
	            System.out.println(c.toString());

	        } catch (IOException | ClassNotFoundException e)
			{
	            e.printStackTrace();
	        }*/
		
	}
	public void display()
	{
		
        System.out.println(h);
	}
}
