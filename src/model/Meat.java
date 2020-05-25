package model;

public class Meat extends Product{
	
	private String animal;
	
	public Meat(String code, String name, double price, int inventory, double weight, String animal)
	{
		super(code, name, price, inventory, weight);
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}
	
}
