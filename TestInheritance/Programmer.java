package TestInheritance;

public class Programmer extends Employee{
	float bonus=10000f;
	
	public static void main(String[] args) {
		Programmer P= new Programmer();
		System.out.println(P.bonus);
		System.out.println(P.salary);
		System.out.println((P.salary+P.bonus));
		System.out.println(P.empid+P.name);
		P.show();
	}

}
