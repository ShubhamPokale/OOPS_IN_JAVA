package Default;

public class Demo {

    static int  a;
	public static int add(int n1,int n2) {
		a=10;
		int b=20;
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java!!!");

		add(a, a);
		System.out.println("Addition:"+add(a, a));

				
	}

}
