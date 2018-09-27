package model;

public class Info {
	
	private Integer zip;
	private String street;
	private int number;
	private String stateIntial;
	
	public Info() {
		
	}
	
	public Info(int zip, String street, int number, String stateInitial) {
		this.zip = zip;
		this.street = street;
		this.number = number;
		this.stateIntial = stateInitial;
	}
	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStateIntial() {
		return stateIntial;
	}
	public void setStateIntial(String stateIntial) {
		this.stateIntial = stateIntial;
	}
}
