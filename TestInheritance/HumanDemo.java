package TestInheritance;

public class HumanDemo extends Human{
	String color="Black";
	
	public HumanDemo() {
		
	}
	
	void showColor() {
		
		super.showColor();//method belongs to parent class
		System.out.println("I Am in Color Method:"+color);
	}
	
	void display() {
		System.out.println("I am a Show Piece");
	}
	
	public static void main(String[] args) {
		HumanDemo h=new HumanDemo();
		h.showColor();
		h.display();
		
	}
}
