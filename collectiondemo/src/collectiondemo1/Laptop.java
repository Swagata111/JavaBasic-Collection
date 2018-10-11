package collectiondemo1;

public class Laptop 
{
public String company;
public String model;
public String operatingSystem;
public String processor;
@Override
public String toString() {
	return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem + ", processor="
			+ processor + "]";
}
public Laptop(String company, String model, String operatingSystem, String processor) {
	super();
	this.company = company;
	this.model = model;
	this.operatingSystem = operatingSystem;
	this.processor = processor;
}
public boolean equals(Laptop s1)
{
	if(s1.company.equals(this.company) && s1.model.equals(this.model))
		return true;
	else
	return false;
}

}
