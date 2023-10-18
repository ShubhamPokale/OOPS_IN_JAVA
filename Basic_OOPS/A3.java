package Basic_OOPS;

public class A3 {
	A3(){
		System.out.println("I Am A");
	}
	
	A3(int x){
		this();
		System.out.println("I Am X:"+x);
	}
	

	public static void main(String[] args) {
		A3 a=new A3(10);
		
	}
}
