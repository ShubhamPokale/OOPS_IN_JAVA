package Basic_OOPS;
//this: to pass as an argument in the method
public class A5 {

	void m(A5 obj) {
		System.out.println("I am in M method");
	}
	
	void p() {
		m(this);
	}
	
	public static void main(String[] args) {
		A5 a=new A5();
		a.p();
	}
}
