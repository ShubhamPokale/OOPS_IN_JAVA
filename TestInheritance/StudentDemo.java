package TestInheritance;

public class StudentDemo extends Student{
	String address;
	String phonenum;
	
	StudentDemo(){
		super(131,"Amit",4000f);
		address="Kothrud";
		phonenum="7770000088";
	}
	
	StudentDemo(String address, String phonenum){
		super();
		this.address=address;
		this.phonenum=phonenum;
	}
	
	void display() {
		super.display();
		System.out.println(address+" "+phonenum);
	}
	
	public static void main(String[] args) {
		StudentDemo s=new StudentDemo();
		s.display();
		StudentDemo s1=new StudentDemo("Bavdhan","9666666678");
		s1.display();
	}

}
