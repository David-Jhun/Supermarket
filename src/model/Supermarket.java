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
	
	public void addClient(String documentType, String documentNumber, String name, String email, String address) {
		Client c = new Client(documentType, documentNumber, name, email, address);
		if( firstClient == null )
			firstClient = c;
		else 
		{
			Client temporal = firstClient;
			while( temporal.getNext() != null )
			{
				temporal = temporal.getNext();
			}
			temporal.setNext(c);
		}
	}
	
	public Client searchClient( String name ) 
	{
		Client c = null;
		if( firstClient.getName().compareToIgnoreCase(name) == 0 )
			c = firstClient;
		else
		{
			Client temporal = firstClient;
			while( temporal != null && !(temporal.getName().compareToIgnoreCase(name) == 0) )
			{
				temporal = temporal.getNext();
			}
			if( temporal != null )
				c = temporal;
		}
		return c;
	}
	
	public boolean deleteClient( String name )
	{
		boolean deleted = false;
		if( firstClient.getName().compareToIgnoreCase(name) == 0 ) {
			if( firstClient.getNext() == null )
			{
				firstClient = null;
				deleted = true;
			}
			else if( firstClient.getNext() != null ) 
			{
				firstClient = firstClient.getNext();
				deleted = true;
			}
		}else
		{
			Client previous = null;
			Client current = firstClient;
			while( current != null && !(current.getName().compareToIgnoreCase(name) == 0) )
			{
				previous = current;
				current = current.getNext();
			}
			if( current != null ) {
				previous.setNext(current.getNext());
				deleted = true;
			}
		}
		return deleted;
	}
	
	public void addProvider() 
	{
		
	}
	
	public void addManagement(String documentType, String documentNumber, String name, String email, String cellphone, String address, String position)
	{
		Management m = new Management(documentType, documentNumber, name, email, cellphone, address, position);
		if( rootManagement == null )
			rootManagement = m;
		else 
			rootManagement.add(m);
	}
	
	public Management searchManagement( String name )
	{
		return rootManagement.search(name);
	}
	
	public int getWeigtManagementTree()
	{
		return rootManagement.getWeight();
	}
	
	public ArrayList<Management> managementList()
	{
		if( rootManagement == null )
			return null;
		else {
			ArrayList<Management> list = new ArrayList<Management>();
			rootManagement.inOrden(list);
			return list;
		}
			
	}
	
	public void addCandidate(String documentType, String documentNumber, String name, String email, String cellphone, String address, int yearsOfExperience)
	{
		Candidate son = new Candidate(documentType, documentNumber, name, email, cellphone, address, yearsOfExperience);
		if( rootCandidate == null )
			rootCandidate = son;
		else
			rootCandidate.add(son);
	}
	
	public Candidate searchCandidate( String name )
	{
		return rootCandidate.search(name);
	}
	
	public void addTv(String name, String brand, double price, String line, String resolution, boolean smartv, boolean wifi) 
	{
		Television tv = new Television(name, brand, price, line, resolution, smartv, wifi);
		televisions.add(tv);
	}
	
	public Television searchTv( String name ) 
	{
		Television searched = null;
		boolean founded = false;
		if( !(televisions.isEmpty()) ) 
		{
			for( int i = 0; i < televisions.size() && !founded ; i++ )
			{
				if( televisions.get(i).getName().equalsIgnoreCase(name) )
				{
					searched = televisions.get(i);
					founded = true;
				}
			}
		}
		return searched;
	}

	public boolean deleteTv( String name ) 
	{
		boolean deleted = false;
		if( !(televisions.isEmpty()) )
		{
			for( int i = 0 ; i < televisions.size() && !deleted ; i++ )
			{
				if( televisions.get(i).getName().equalsIgnoreCase(name) ) 
				{
					televisions.remove(i);
					deleted = true;
				}
			}
		}
		return deleted;
	}
	
	public void bubbleSortTvs()
	{
		
	}
	
	public void selectionSortTvs() 
	{
		
	}
	
	public void addLaptop(String name, String brand, double price, String line, String processor, int ram, String storageType, int amountStorage)
	{
		Laptop laptop = new Laptop(name, brand, price, line, processor, ram, storageType, amountStorage);
		laptops.add(laptop);
	}
	
	public Laptop searchLaptop( String name )
	{
		Laptop laptop = null;
		boolean founded = false;
		if( !(laptops.isEmpty()) )
		{
			for( int i = 0; i < laptops.size() && !founded ; i++ )
			{
				if(laptops.get(i).getName().equalsIgnoreCase(name))
				{
					laptop = laptops.get(i);
					founded = true;
				}
			}
		}
		return laptop;
	}

	public boolean deleteLaptop( String name )
	{
		boolean deleted = false;
		if( !(televisions.isEmpty()) )
		{
			for( int i = 0; i < laptops.size() && !deleted ; i++)
			{
				if( laptops.get(i).getName().equalsIgnoreCase(name) )
				{
					laptops.remove(i);
					deleted = true;
				}
			}
		}
		return deleted;
	}
	
	
}
