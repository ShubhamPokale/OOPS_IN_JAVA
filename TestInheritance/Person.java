package TestInheritance;

public class Person {

	String name;
	int id;
	Address details;
	
	public Person() {
		name="Akshit";
		id=1001;
		details=new Address();
	}
	
	public Person(String name,int id,String city,String area,String state) {
		this.name=name;
		this.id=id;
		this.details=details;
	}
	
	void display() {
		System.out.println(name+" "+id);
		details.show();
	}
	
}
