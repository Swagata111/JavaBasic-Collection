package collectiondemo1;

public class Cellphone 
{
	public String company;
	public String model;
	public String description;
	public String operatingSystem;
	public double price;
	public Cellphone(String company, String model, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}
	public boolean equals(Cellphone s1)
	{
		if(s1.company.equals(this.company) && s1.model.equals(this.model) 
				&& s1.operatingSystem.equals(this.operatingSystem))
			return true;
		else
		return false;
	}

}
