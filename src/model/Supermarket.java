package model;

import java.util.ArrayList;

public class Supermarket {
	
	private Client firstClient;
	
	private Provider firstProvider;
	
	private Management rootManagement;
	
	private Candidate rootCandidate;
	
	private ArrayList<Television> televisions;
	
	private ArrayList<Laptop> laptops;
	
	public Supermarket() {
		firstClient = null;
		firstProvider = null;
		rootManagement = null;
		rootCandidate = null;
		televisions = new ArrayList<Television>();
		laptops = new ArrayList<Laptop>();
	}

	public Client getFirstClient() {
		return firstClient;
	}

	public Provider getFirstProvider() {
		return firstProvider;
	}

	public Management getRootManagement() {
		return rootManagement;
	}

	public Candidate getRootCandidate() {
		return rootCandidate;
	}

	public ArrayList<Television> getTelevisions() {
		return televisions;
	}

	public ArrayList<Laptop> getLaptops() {
		return laptops;
	}
	
	

}
