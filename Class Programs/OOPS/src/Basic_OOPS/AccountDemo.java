package Basic_OOPS;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1=new Account(111,6000.00);
		a1.Display();
		a1.updateIntRate(10.0f);
		Account a2=new Account(112,5000.00);
		a2.Display();
		
	}

}
