package Basic_OOPS;

public class Student {
	int rollno;
	String name;
	
	void display() {
		System.out.println("I am in method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.rollno=101;
		s1.name="Rucha";
		s2.rollno=102;
		s2.name="Aditya";
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		s1.display();
	}

}
