package model;

public class Client extends User{
	
	private int points;

	public Client(String documentType, String documentNumber, String name, String email, String address) {
		super(documentType, documentNumber, name, email, address);
		points = 0;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	

}
