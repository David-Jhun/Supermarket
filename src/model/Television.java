package model;

public class Television extends HouseholdAppliance{
	
	private String resolution;
	private boolean smartv;
	private boolean wifi;

	public Television(String name, String brand, double price, String line, String resolution, boolean smartv, boolean wifi) {
		super(name, brand, price, line);
		this.resolution = resolution;
		this.smartv = smartv;
		this.wifi = wifi;
	}

	public String getResolution() {
		return resolution;
	}

	public boolean isSmartv() {
		return smartv;
	}

	public boolean isWifi() {
		return wifi;
	}

	@Override
	public String toString() {
		String m = "";
		m += "\nTelevision";
		m += super.toString();
		m += "\nResolution: " + resolution;
		m += "\nSmart TV: " + "Yes";
		m += "\nWifi: " + "Yes";
		return m;
	}
	
}
