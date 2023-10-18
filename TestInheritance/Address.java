package TestInheritance;

public class Address {

	String area;
	String city;
	String state;
	
	Address(){
		area="Kothrud";
		city="Pune";
		state="Maharashtra";
	}

	public Address(String area, String city, String state) {
		this.area = area;
		this.city = city;
		this.state = state;
	}
	
	void show() {
		System.out.println(area+" "+city+" "+state);
	}
	
	
}
