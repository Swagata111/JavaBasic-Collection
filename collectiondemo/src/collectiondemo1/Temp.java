package collectiondemo1;
import java.lang.reflect.Array;
import java.util.*;
public class Temp {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String pid[]=new String[10];
		Product p[]=new Product[10]; 
		String pnm[]=new String[10];
		System.out.println("Enter product id for 5 products:");
	     for(int i=0;i<5;i++)
	    	 pid[i]=s.nextLine();
	     System.out.println("Enter product name for 5 products:");
	     for(int i=0;i<5;i++)
	    	 pnm[i]=s.nextLine();
	     for(int i=0;i<5;i++)
	     {
	    	 p[i]=new Product(pid[i],pnm[i]);
	     }
	     TreeMap<String,String> map=new TreeMap<String,String>(); 
	     for(int i=0;i<5;i++)
	     {
	    	 map.put(p[i].prodId,p[i].prodName);
	     }
	     
	     System.out.println(map);
	     
	}

}
