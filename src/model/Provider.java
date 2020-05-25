package model;

public class Provider extends Worker implements Commodity{
	
	private String product;
	private int quantityOrdered;
	private double price;

	public Provider(String documentType, String documentNumber, String name, String email, 
			String cellphone, String address, int quantityOrdered, double price)
	{
		super(documentType, documentNumber, name, email, cellphone, address);
		this.quantityOrdered = quantityOrdered;
		this.price = price;
	}
	
	public String getProduct() {
		return product;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double merchandiseCost() {
		return price * quantityOrdered;
	}
	
}
