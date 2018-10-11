package collectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ListIterator 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("Swagata");
		l.add("Ashwini");
		l.add("tanu");
		System.out.println(l);
		java.util.ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("Swagata"))
				itr.remove();
			
			
		}
		System.out.println(l);
	}
}
