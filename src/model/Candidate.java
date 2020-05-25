package model;

public class Candidate extends Worker{
	
	private int yearsOfExperience;
	
	public Candidate(String documentType, String documentNumber, String name, String email, String cellphone, String address, 
			int yearsOfExperience) 
	{
		super(documentType, documentNumber, name, email, cellphone, address);
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
}
