package collectiondemo1;

import java.util.ArrayList;

public class Parked_CarOwenerList 
{
	static ArrayList<Parked_CarOwner_Details> a=new ArrayList<Parked_CarOwner_Details>();
public static int add_new_car(Parked_CarOwner_Details obj)
{
	a.add(obj);
	return 0;
}
public static void remove_car(Parked_CarOwner_Details obj)
{
	a.remove(obj);
}
public static String get_parked_car_location(String token)
{
	for(Parked_CarOwner_Details i:a)
	if(i.carNO.equals(token))
		return i.owerAddress;
	return null;
}
	public static void main(String[] args) 
	{
		Parked_CarOwner_Details p1=new Parked_CarOwner_Details("Swagata","Audi","9876","9876534567","Kolkata");
		Parked_CarOwner_Details p2=new Parked_CarOwner_Details("Ashwini","Maruti","7876","9876874567","Kolkata");
		Parked_CarOwner_Details p3=new Parked_CarOwner_Details("Sangita","Jaguar","7656","9876534554","Mumbai");
		add_new_car(p1);
		add_new_car(p2);
		add_new_car(p3);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		System.out.println("After removing:");
		remove_car(p2);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		System.out.println("Location:"+get_parked_car_location("7656"));
		
	}

}
