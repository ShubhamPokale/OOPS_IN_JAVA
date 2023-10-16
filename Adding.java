package Basic_OOPS;
//Method Overloading: changing data type of arguments
public class Adding {
	
	int add(int x, int y) {
		return x+y;
	}
	
	double add(double x, double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Adding a=new Adding();
		System.out.println(a.add(20,20));
		System.out.println(a.add(40.0,40.0));
	}

}
