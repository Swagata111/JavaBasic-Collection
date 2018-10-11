package collectiondemo1;

public class School 
{
	public String name;
	public String city;
	public String schoolDistrict;
	public int greatSchoolRanking;
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) 
	{
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public boolean equals(School s1)
	{
		if(s1.name.equals(this.name) && s1.city.equals(this.city) && s1.schoolDistrict.equals(this.schoolDistrict))
			return true;
		else
		return false;
	}

}
