package TestInheritance;

public class TestBank extends SBI{
	
	int getROI() {
		return 11;
	}
	public static void main(String[] args) {
	
//		SBI s=new SBI();
//		BOI b=new BOI();
//		HDFC h=new HDFC();
//		//TestBank s= new TestBank();
		
		//SBI s=new Bank();//downcastig not allowed
		
		Bank b;
		b=new SBI();//upcasting//run time polymorphism
		System.out.println(b.getROI());
		b.show();
		b=new BOI();
		System.out.println(b.getROI());
		b.show();
		b=new HDFC();
		System.out.println(b.getROI());
		b.show();
		b=new Bank();
		System.out.println(b.getROI());
		b.show();

		//System.out.println("rate is:"+s.getROI());
	}
	
	
}
