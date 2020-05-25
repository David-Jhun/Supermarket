package model;

public class Management extends Worker implements Salary{
	
	private double salary;
	private String position;

	public Management(String documentType, String documentNumber, String name, String email, 
			String cellphone, String address, String position) 
	{
		super(documentType, documentNumber, name, email, cellphone, address);
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public String getPosition() {
		return position;
	}

	@Override
	public double totalSalary() 
	{
		return salary;
	}
	
}
