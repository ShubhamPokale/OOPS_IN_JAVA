package Basic_OOPS;
// Method Overloading: changing no. of arguments
public class Adder {

	static int add(int x,int y) {
		return x+y;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	
	
	public static void main(String[] args) {
		//Adder a=new Adder();
		System.out.println(add(10,10));
		System.out.println(add(10,10,10));
	}
}
