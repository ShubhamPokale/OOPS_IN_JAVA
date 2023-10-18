package Basic_OOPS;

public class A4 {

	A4(){
		this(25);
		System.out.println("I am in A4");
	}
	
	A4(int x){
		System.out.println("I am X:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A4 a=new A4();
	}

}
