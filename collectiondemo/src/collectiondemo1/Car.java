package collectiondemo1;

public class Car 
{
	public String make;
	public String model;
	public String year;
	public double price;
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	public Car(String make, String model, String year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public boolean equals(Car s1)
	{
		if(s1.make.equals(this.make) && s1.model.equals(this.model))
			return true;
		else
		return false;
	}

}
