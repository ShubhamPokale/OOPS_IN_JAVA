package Basic_OOPS;

public class Student3 {

	int rollno;
	String name;
	float fee;
	
	public Student3() {
		System.out.println("I am Student");
	}
	
	public Student3(int rollno,String name,float fee) {
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
		
	}
}	
