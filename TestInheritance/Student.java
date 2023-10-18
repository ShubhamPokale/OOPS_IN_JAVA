package TestInheritance;

public class Student {
	int rollno;
	String name;
	float fees;
	
	public Student() {
		rollno=1;
		name="Mayur";
		fees=25000f;
	}
	public Student(int rollno,String name, float fees) {
	
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+fees);
	}

}
