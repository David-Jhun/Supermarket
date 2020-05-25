package model;

public class Management extends Worker implements Salary, Comparable<Management>{
	
	private double salary;
	private String position;
	
	private Management leftSon;
	private Management rightSon;

	public Management(String documentType, String documentNumber, String name, String email, 
			String cellphone, String address, String position) 
	{
		super(documentType, documentNumber, name, email, cellphone, address);
		this.position = position;
		leftSon = null;
		rightSon = null;
	}

	public double getSalary() {
		return salary;
	}

	public String getPosition() {
		return position;
	}
	
	public Management getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(Management leftSon) {
		this.leftSon = leftSon;
	}

	public Management getRightSon() {
		return rightSon;
	}

	public void setRightSon(Management rightSon) {
		this.rightSon = rightSon;
	}

	@Override
	public double totalSalary() 
	{
		return salary;
	}

	@Override
	public int compareTo(Management o) {
		if( getName().compareToIgnoreCase(o.getName()) < 0 )
			return -1;
		else if( getName().compareToIgnoreCase(o.getName()) < 0 )
			return 1;
		else 
			return (int)(salary - o.salary);
			
	}
	
}
