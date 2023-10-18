package TestInheritance;

public class Student1 {
	
	int rollno;
	String name;
	String college;

	public Student1() {
		rollno=151;
		name="Akshay";
		college="Infoway";
	}

	public Student1(int rollno, String name, String college) {
		this.rollno = rollno;
		this.name = name;
		this.college = college;
	}
	
	void show() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	

}
