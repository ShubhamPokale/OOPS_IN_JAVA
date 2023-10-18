package TestInheritance;

public class Human {
	String color="white";
	
	void showColor() {
		
		System.out.println("I am in Color Method:"+color);
	}
	
	void show() {
		System.out.println("I am Normal method");
	}
	
	public Human() {
		color="Red";
		System.out.println(color);
	}

}
