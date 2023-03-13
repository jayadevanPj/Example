package Aggregation;

public class Person {
	private String name;
	private int age;

	private Address address;
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAdress()
	{
		return address;

	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge() {
		return age;

	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;

	}
	public static void main(String args[])
	{
		Person p= new Person();
		p.setName("Gopika");
		p.setAge(30);
		Address ad=new Address();
		ad.sethouseName("Geethlayam");
		ad.setStreetName("vazhoor");
		ad.setZipCode(686504);
		p.setAddress(ad);
		System.out.println("name is "+p.getName()+"Age "+p.age+"Adress "+p.getAdress().gethouseName()+","+p.getAdress().getStreetName()+","+p.getAdress().getzipCode());
	}

}
