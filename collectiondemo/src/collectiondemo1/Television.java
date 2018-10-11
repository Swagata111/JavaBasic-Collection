package collectiondemo1;

public class Television
{
public String company;
public String type;
public boolean is3Denabled;
public double price;
@Override
public String toString() {
	return "Television [company=" + company + ", type=" + type + ", is3Denabled=" + is3Denabled + ", price=" + price
			+ "]";
}
public Television(String company, String type, boolean is3Denabled, double price) {
	super();
	this.company = company;
	this.type = type;
	this.is3Denabled = is3Denabled;
	this.price = price;
}

}
