package TestInheritance;

public class Student1Demo extends Student1{
	
	void show() {
		super.show();
		System.out.println(" I am in Child Class");
	}
	
	public static void main(String[] args) {
		Student1Demo s=new Student1Demo();
		s.show();
	}

}
