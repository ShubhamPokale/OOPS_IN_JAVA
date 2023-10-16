package Basic_OOPS;

public class Employee {
	int empid;
	String name;
	double sal;
	public static int count;
	
	/*
	 * public boolean add() { return true; }
	 */
	
	static {
		count=0;
	}
	
	public Employee(int a,String b,double c) {
		this.empid=a;//101
		this.name=b;//SAM
		this.sal=c;//40000.00
		System.out.println(empid+" "+name+" "+sal);
		count++;
	}
	
	public Employee(int x,String y) {
		empid=121;
		name="RAM";
		System.out.println(empid+" "+name);
		System.out.println(x+" "+y);
	}
	
	void show() {
		System.out.println("Count is:"+count);
	}



	public static void main(String[] args) {
		Employee e1=new Employee(101,"SAM",40000.00);
//		Employee e3=new Employee(102,"RADHA",50000.00);
//		Employee e2=new Employee(1,"SHYAM");
//		e1.show();
//		e3.show();
//		e2.show();
		
		
	}

}
