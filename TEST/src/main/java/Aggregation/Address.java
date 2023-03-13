package Aggregation;

public class Address {

	private String houseName,streetName;
	private int zipCode;

	public void sethouseName(String houseName)
	{
		this.houseName=houseName;
	}
	public String gethouseName()
	{
		return houseName;
	}
	public void setStreetName(String streetName)
	{
		this.streetName=streetName;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public void setZipCode(int zipCode)
	{
		this.zipCode=zipCode;
	}
	public int getzipCode()
	{
		return zipCode;
	}


}
