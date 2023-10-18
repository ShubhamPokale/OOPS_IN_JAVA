package TestInheritance;

public class TestPoly extends Square{
	
	void render(){
		System.out.println("I am Test Poly");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestPoly t=new TestPoly();
		t.render();
		Square s=new Square();
		s.render();//Square
		Circle c=new Circle();
		c.render();//Circle
		Pattern p=new Pattern();
		p.display();
		p.display('#');
	}

}
