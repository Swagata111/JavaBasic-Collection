package collectiondemo1;

import java.util.*;

public class EmployeeAccountMain {

	public static void main(String[] args) 
	{
		ArrayList<Employe_Information > e=new ArrayList<Employe_Information >();
		ArrayList<MMA_Saving_Account> m=new ArrayList<MMA_Saving_Account>();
		Employe_Information e1=new Employe_Information("01","Swagata","Analyst",56000.00,879.00);
		Employe_Information e2=new Employe_Information("02","S.K","AnalystA1",46000.00,279.00);
		e.add(e1);
		e.add(e2);
		MMA_Saving_Account m1=new MMA_Saving_Account("0289","Swagata",7890.00,true);
		MMA_Saving_Account m2=new MMA_Saving_Account("06789","S.K",7860.00,false);
		m.add(m1);
		m.add(m2);
		
		ArrayList a=new ArrayList();
		for(Employe_Information i:e)
		{
			for(MMA_Saving_Account j:m)
			{
				if(i.Employee_Name.equals(j.accountholder_name))
				{
					a.add(i);
					a.add(j);
				}
			}
		}
	for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));

	}

}
