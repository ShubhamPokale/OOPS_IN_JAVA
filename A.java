package Basic_OOPS;

public class A {
void m() {
	System.out.println("I am in M method");
}


void n() {
	
	System.out.println("I am in N method");
	this.m();
}

public static void main(String[] args) {
	new A().n();
	new A().m();
}
}
