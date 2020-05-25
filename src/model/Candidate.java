package model;

public class Candidate extends Worker implements Comparable<Candidate>{
	
	private int yearsOfExperience;
	
	private Candidate leftSon;
	private Candidate rightSon;
	
	public Candidate(String documentType, String documentNumber, String name, String email, String cellphone, String address, 
			int yearsOfExperience) 
	{
		super(documentType, documentNumber, name, email, cellphone, address);
		this.yearsOfExperience = yearsOfExperience;
		leftSon = null;
		rightSon = null;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public Candidate getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(Candidate leftSon) {
		this.leftSon = leftSon;
	}

	public Candidate getRightSon() {
		return rightSon;
	}

	public void setRightSon(Candidate rightSon) {
		this.rightSon = rightSon;
	}

	@Override
	public int compareTo(Candidate c) {
		
		if( getName().compareToIgnoreCase(c.getName()) < 0 )
			return -1;
		else if(getName().compareToIgnoreCase(c.getName()) > 0)
			return 1;
		else 
			return yearsOfExperience - c.yearsOfExperience;
	}
	
	
	
}
