package collectiondemo1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LaptopCarSchoolTest {

	public static void main(String[] args)
	{
		Car c[]=new Car[4];
		Laptop l[]=new Laptop[4];
		Television t[]=new Television[4];
				Cellphone p[]=new Cellphone[4];
						School s[]=new School[4];
		
		
		 c[1]=new Car("Tata","Sumo","12-12-2000",200000);
		 l[1]=new Laptop("Hp","012","Windows","i3");
		 t[1]=new Television("LG","LCD",true,78000);
		 p[1]=new Cellphone("Samsung","J5","Smartphone","Android",15000);
		 s[1]=new School("J.V","Kolkata","W.B",12);
		
		c[3]=new Car("Tata","Maruti","12-12-2000",400000);
		l[3]=new Laptop("Dell","013","Linux","i5");
		t[3]=new Television("LG","LED",true,78000);
		p[3]=new Cellphone("REDMI","Note3","Smartphone","Android",12000);
		 s[2]=new School("J.V","Kolkata","W.B",12);
		
		c[2]=new Car("Tata","Sumo","12-12-2000",200000);
		 l[2]=new Laptop("Hp","012","Linux","i3");
		t[2]=new Television("LG","LCD",false,78000);
		p[2]=new Cellphone("Samsung","J5","Smartphone","Android",16000);
		s[3]=new School("D.A.V","Kolkata","W.B",10);
		
		ArrayList<Car> cl=new ArrayList<Car>();
		ArrayList<Laptop> ll=new ArrayList<Laptop>();
		ArrayList<Television> tl=new ArrayList<Television>();
		ArrayList<Cellphone> cpl=new ArrayList<Cellphone>();
		ArrayList<School> sl=new ArrayList<School>();
		HashSet<Car> cs=new HashSet<Car>();
		HashSet<Laptop> ls=new HashSet<Laptop>();
		HashSet<Television> ts=new HashSet<Television>();
		HashSet<Cellphone> cps=new HashSet<Cellphone>();
		HashSet<School> ss=new HashSet<School>();
		for(int i=1;i<=3;i++)
		{
			cl.add(c[i]);
			ll.add(l[i]);
			tl.add(t[i]);
			cpl.add(p[i]);
			sl.add(s[i]);
			cs.add(c[i]);
			ls.add(l[i]);
			ts.add(t[i]);
			cps.add(p[i]);
			ss.add(s[i]);
		}
		cl.add(c[1]);
		
		
		
		System.out.println("HashSet");
		System.out.println(cs);
		System.out.println(ls);
		System.out.println(ts);
		System.out.println(cps);
		System.out.println(ss);
		
		System.out.println("\nList");
		System.out.println(cl);
		System.out.println(ll);
		System.out.println(tl);
		System.out.println(cpl);
		System.out.println(sl);
		
		for(int i=1;i<=2;i++)
		{
			if(c[i].equals(c[i+1]))
				cs.remove(c[i]);
		}
		
		for(int i=3;i>=2;i--)
		{
			if(s[i].equals(s[i-1]))
				ss.remove(s[i]);
		}
		
		for(int i=1;i<=2;i++)
		{
			if(t[i].equals(t[i+1]))
				ts.remove(t[i]);
		}
		
		for(int i=1;i<=2;i++)
		{
			if(l[i].equals(l[i+1]))
				ls.remove(l[i]);
		}
		
		for(int i=1;i<=2;i++)
		{
			if(p[i].equals(p[i+1]))
				cps.remove(p[i]);
		}
		
		System.out.println("\nHashSet after removing duplicates");
		System.out.println(cs);
		System.out.println(ls);
		System.out.println(ts);
		System.out.println(cps);
		System.out.println(ss);
	}

}
