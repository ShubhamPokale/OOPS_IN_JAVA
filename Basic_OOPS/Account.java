package Basic_OOPS;

public class Account {

	private int accno;
	private double balance;
	private static float int_rate;

	static {
		int_rate = 4.7f;
		System.out.println("Interest Rate Fixed");
	}

	public Account() {

	}

	public Account(int accno, double balance) {
		this.accno = accno;
		this.balance = balance;
	}

	public void Display() {
		System.out.println("Accno :" + this.accno);
		System.out.println("Balance:" + (this.balance + calInterest()));
	}

	public double calInterest() {
		return balance * int_rate / 100;
	}

	public static void updateIntRate(float newrate) {
		int_rate = newrate;
	}

}
