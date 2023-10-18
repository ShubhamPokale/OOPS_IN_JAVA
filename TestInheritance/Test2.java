package TestInheritance;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z;
		z=new Animals();//upcasting
		z.show('A',123);
		z=new Birds();
		z.show('B',123);
		

	}

}
