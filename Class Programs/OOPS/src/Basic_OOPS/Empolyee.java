package Basic_OOPS;

public class Empolyee {
	int empid;
	String address;
	Person name;
	Person bdate;
	
	public Empolyee() {
		this.empid=empid;
		this.address=address;
		//this.name=new Person();
		this.bdate=new Person();
	}
	
	void show() {
		System.out.println(empid+" "+address+" "+name+" "+bdate);
	}

}
