package collectiondemo1;

import java.util.ArrayList;
import java.util.*;

public class Movie_DetailsList 
{
	static ArrayList<Movie_Details> a=new ArrayList<Movie_Details>();
	public static void addMovie(Movie_Details m)
	{
		a.add(m);
	}
	public static void removeMovie(Movie_Details m)
	{
		a.remove(m);
	}
	
	public static void remove_allMovies(ArrayList<Movie_Details> a2)
	{
		a.removeAll(a);
	}
	public static Movie_Details find_movie_By_mov_Name(String name)
	{
		Iterator<Movie_Details> itr = a.iterator();
		 while (itr.hasNext())
	        {
	            Movie_Details x = itr.next();
	           
				if (x.mov_name==name)
	                return x;
	        }
		return null;
	}
	
	public static Movie_Details find_movie_By_genre(String genr)
	{
		Iterator<Movie_Details> itr = a.iterator();
		 while (itr.hasNext())
	        {
	            Movie_Details x = itr.next();
	           
				if (x.genre==genr)
	                return x;
	        }
		return null;
	}
	public static void sort_movie(String type)
	{
		a.sort((o1, o2) -> o1.mov_name.compareTo(o2.mov_name));
		System.out.println("Sorted Order");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
	}
	 
			
@SuppressWarnings("resource")
public static void main(String[] args)
{
	Movie_Details m1=new Movie_Details("ab","bc","cd","ef");
	Movie_Details m2=new Movie_Details("abc","bcd","cdh","efg");
	Movie_Details m3=new Movie_Details("abcd","bfgc","hjcd","jkef");
	Movie_Details m4=new Movie_Details("ahgb","bhygfc","chygfd","ejkf");
	addMovie(m1);
	addMovie(m4);
	addMovie(m2);
	addMovie(m3);
	removeMovie(m1);
	//remove_allMovies(a);
	for(int i=0;i<a.size();i++)
	System.out.println(a.get(i));
	Movie_Details mid=find_movie_By_mov_Name("abc");
	System.out.println("Found movie by movie:"+mid);
	Movie_Details mgn=find_movie_By_genre("ejkf");
	System.out.println("Found movie by genre:"+mgn);
	sort_movie(m1.mov_name);	
}
}
