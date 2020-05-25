package model;

public class Bakery extends Product{
	
	private boolean gluten;

	public Bakery(String code, String name, double price, int inventory, double weight, boolean gluten) {
		super(code, name, price, inventory, weight);
		this.gluten = gluten;
	}

	public boolean isGluten() {
		return gluten;
	}
	
}
